package org.galapagos.jelly.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.galapagos.jelly.vo.PageRequest;
import org.galapagos.jelly.vo.Region;
import org.galapagos.jelly.vo.TravelVO;
import org.junit.jupiter.api.Test;

class TravelDaoImplTest {
//	TravelDao dao = TravelOracleDaoImpl.getInstance();	//오라클
	TravelDao dao = TravelMySQLDaoImpl.getInstance(); // MySQL

	@Test
	void testGetInstance() {
//		TravelDao dao2 = TravelOracleDaoImpl.getInstance();
		TravelDao dao2 = TravelMySQLDaoImpl.getInstance();

		assertSame(dao, dao2);
	}

	@Test
	void testGetTotalCount() {
		int totalCount = dao.getTotalCount();

		assertTrue(totalCount > 100);
	}

	@Test
	void testGetPage() {

		PageRequest pageRequest = new PageRequest(10, 10);

		List<TravelVO> list = dao.getPage(pageRequest);
		assertTrue(list.size() == 10);

		pageRequest.setStart(110);
		list = dao.getPage(pageRequest);
		assertTrue(list.size() == 2);
		assertEquals(2, list.size());
	}

	@Test
	void testGetRegions() {
		List<Region> list = dao.GetRegions();
		assertEquals(6, list.size());
	}

	@Test
	void testGetSpots() {
		List<TravelVO> list = dao.GetSpots("수도권");
		assertEquals(13, list.size());
	}

	@Test
	void testSearch() {
		List<TravelVO> list = dao.search("%해수욕장%");
		assertEquals(9, list.size());
	}

	@Test
	void testFindById() {
		TravelVO travel = dao.findById(10);
		assertNotNull(travel);

		travel = dao.findById(210);
		assertNull(travel);
	}

}
