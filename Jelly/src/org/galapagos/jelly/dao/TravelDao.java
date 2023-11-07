package org.galapagos.jelly.dao;

import java.util.List;

import org.galapagos.jelly.vo.PageRequest;
import org.galapagos.jelly.vo.Region;
import org.galapagos.jelly.vo.TravelVO;

public interface TravelDao {
	// 전체 데이터 건수 얻기
	int getTotalCount();

	// 페이지 목록 얻기
	List<TravelVO> getPage(PageRequest pageRequest);

	// 권역 목록 얻기
	List<Region> GetRegions();

	// 선택 권역의 관광지 목록 얻기
	List<TravelVO> GetSpots(String region);

	// 검색
	List<TravelVO> search(String keyword);

	// 상세보기 - 지정한 번호의 관광지 얻기
	TravelVO findById(int no);

}
