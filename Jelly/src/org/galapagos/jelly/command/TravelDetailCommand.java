package org.galapagos.jelly.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.cli.command.Command;
import org.galapagos.jelly.dao.TravelDao;
import org.galapagos.jelly.dao.TravelMySQLDaoImpl;
import org.galapagos.jelly.vo.TravelVO;

public class TravelDetailCommand implements Command {
	TravelDao dao = TravelMySQLDaoImpl.getInstance();

	@Override
	public void execute() {
		// No: 104 ---> 입력받기
		int no = Input.readInt("No: ");

		TravelVO travel = dao.findById(no);
		if (travel == null) {
			System.out.println("잘못된 번호입니다.");
			return;
		}
		// 권역: ????
		// 관광지명: ????
		// 주소: ????
		// 전화번호: ????
		// ???????????...(description)
		System.out.println("====================================");
		System.out.println("권역: " + travel.getRegion());
		System.out.println("관광지명: " + travel.getTitle());
		System.out.println("주소: " + travel.getAddress());
		System.out.println("전화번호: " + travel.getPhone());
		System.out.println(travel.getDescription().replace(". ", ".\n"));
		System.out.println("====================================");

	}

}
