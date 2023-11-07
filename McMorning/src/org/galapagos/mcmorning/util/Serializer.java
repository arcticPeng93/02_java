package org.galapagos.mcmorning.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {

	// deserialize 역직렬화
	public static Object load(String filePath) throws Exception {
		// 예외 처리는 호출한 쪽에서 처리
		// 닫기(close)만 자동화
		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);) {
			return ois.readObject(); // 인스턴스 복원
		}
	}

	// serialize 직렬화
	public static void save(String filePath, Object obj) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(obj);
			oos.flush();
		}
	}
}
