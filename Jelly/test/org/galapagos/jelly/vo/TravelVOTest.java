package org.galapagos.jelly.vo;

class TravelVOTest {

	public static void main(String[] args) {
		// Builder 패턴
		// 생성자의 매개변수가 너무 많을 경우 사용
		// 순서 무관하고, 요소를 빠트려도 상관없음.
		// TrevelVO travel = new TravelVO( ... );
		TravelVO travel = TravelVO.builder().address("서울 특별시") // 메서드 체이닝
				.region("수도권").title("멀티캠퍼스").phone("010-1577-1577").build();

		System.out.println(travel);
	}

}
