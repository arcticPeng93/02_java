package java_study.chapter07.sec05;

public class BbsUse {

	public static void main(String[] args) {
		Bbs[] bbsArr = { new Bbs(1, "java", "hard java", "kim"), new Bbs(2, "jsp", "noteasy jsp", "hong"),
				new Bbs(3, "spring", "idunno", "park"), };

		System.out.println("게시판");
		System.out.println("-----");
		System.out.println("no title content writter");
		System.out.println("-----");

		for (Bbs bbs : bbsArr) {
			System.out.printf("%-3d %-10s %-10s %-10s\n", bbs.getNo(), bbs.getTitle(), bbs.getContent(),
					bbs.getWriter());
		}

	}

}
