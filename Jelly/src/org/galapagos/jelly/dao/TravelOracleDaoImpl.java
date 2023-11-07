package org.galapagos.jelly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.galapagos.jelly.common.JDBCUtil;
import org.galapagos.jelly.vo.PageRequest;
import org.galapagos.jelly.vo.Region;
import org.galapagos.jelly.vo.TravelVO;

public class TravelOracleDaoImpl implements TravelDao {
	Connection conn = JDBCUtil.getConnection();

	// 싱글톤 패턴
	private TravelOracleDaoImpl() {
	}

	private static TravelOracleDaoImpl dao = new TravelOracleDaoImpl();

	public static TravelDao getInstance() {
		return dao;
	}

	@Override
	public int getTotalCount() {
		// 단일행 쿼리
		String sql = "SELECT COUNT(*) TOTAL_COUNT FROM TRAVEL";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				rs.next();
				return rs.getInt("TOTAL_COUNT");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<TravelVO> getPage(PageRequest pageRequest) {
		// 줄바꿈시 스페이스바 하나 넣는것 꼭 신경쓰기!!!!!
		String sql = "SELECT * FROM TRAVEL_VIEW " + "WHERE SEQ BETWEEN ? AND ?";
		List<TravelVO> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			// ?부분 설정
			stmt.setInt(1, pageRequest.getStart());
			stmt.setInt(2, pageRequest.getEnd());

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					// TravelVOTest에서 사용해봤던 Builder패턴을 사용해보자
					TravelVO travel = TravelVO.builder() // 빌더 얻기
							.no(rs.getInt("no")) // no 컬럼
							.region(rs.getString("region")) // region 컬럼
							.title(rs.getString("title")) // title 컬럼
							.description(rs.getString("description")) // description 컬럼
							.address(rs.getString("address")) // address 컬럼
							.phone(rs.getString("phone")) // phone 컬럼
							.build(); // travelVO 인스턴스 생성

					list.add(travel);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Region> GetRegions() {
		String sql = "SELECT REGION, COUNT(*) COUNT FROM TRAVEL " + "GROUP BY REGION " // 권역으로 그룹핑
				+ "ORDER BY COUNT(*)"; // 권역별 건수로 정렬

		List<Region> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					Region region = new Region();
					region.setRegion(rs.getString("region"));
					region.setCount(rs.getInt("count"));
					list.add(region);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<TravelVO> GetSpots(String region) {
		String sql = "SELECT * FROM TRAVEL WHERE REGION = ? ORDER BY TITLE";
		List<TravelVO> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			// ?부분 설정
			stmt.setString(1, region);

			mapList(list, stmt); // -----이 부분 Extract Method로 빼줬음(코드중복)

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private void mapList(List<TravelVO> list, PreparedStatement stmt) throws SQLException {
		try (ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				TravelVO travel = map(rs);

				list.add(travel);
			}

		}
	}

	private TravelVO map(ResultSet rs) throws SQLException {
		TravelVO travel = TravelVO.builder() // 빌더 얻기
				.no(rs.getInt("no")) // no 컬럼
				.region(rs.getString("region")) // region 컬럼
				.title(rs.getString("title")) // title 컬럼
				.description(rs.getString("description")) // description 컬럼
				.address(rs.getString("address")) // address 컬럼
				.phone(rs.getString("phone")) // phone 컬럼
				.build(); // travelVO 인스턴스 생성
		return travel;
	}

	@Override
	public List<TravelVO> search(String keyword) {
		String sql = "SELECT * FROM TRAVEL WHERE TITLE LIKE ? OR DESCRIPTION LIKE ? " // 기본 쿼리
				+ "ORDER BY REGION, TITLE ";
		List<TravelVO> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, keyword);
			stmt.setString(2, keyword);
			mapList(list, stmt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public TravelVO findById(int no) {
		String sql = "SELECT * FROM TRAVEL WHERE NO = ?";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, no);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return map(rs);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
