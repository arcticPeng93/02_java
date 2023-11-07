package org.galapagos.jelly.command;

import java.util.List;

import org.galapagos.common.cli.Input;
import org.galapagos.common.cli.command.Command;
import org.galapagos.jelly.dao.TravelDao;
import org.galapagos.jelly.dao.TravelMySQLDaoImpl;
import org.galapagos.jelly.utils.TravelUtil;
import org.galapagos.jelly.vo.PageRequest;
import org.galapagos.jelly.vo.TravelVO;

public class TravelListCommand implements Command {
	final static int COUNT_PER_PAGE = 10;
	TravelDao dao = TravelMySQLDaoImpl.getInstance();

	@Override
	public void execute() {
		while (true) {
			// 페이지 선택[1~12]: 3
			int totalCount = dao.getTotalCount();
			int totalPage = (int) Math.ceil(totalCount / (double) COUNT_PER_PAGE);
			String title = String.format("페이지 선택[1~%d]: ", totalPage);
			int page = Input.readInt(title);
			if (page == 0) {
				return;
			}

			// page1: 1~10
			// page2: 11~20
			int start = (page - 1) * COUNT_PER_PAGE + 1;
			int end = start + COUNT_PER_PAGE - 1;

			PageRequest pageRequest = new PageRequest(start, COUNT_PER_PAGE);
			List<TravelVO> list = dao.getPage(pageRequest);

			TravelUtil.printTravelList(list);

			System.out.printf("총 %d 건 (페이지: %d/%d)\n", totalCount, page, totalPage);
		}

	}

}
