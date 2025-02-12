package p0211;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
	// ArrayList는 순서대로 저장되며
	// 중복된 값도 상관 없이 저장된다.
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		// 키값이 중요할땐 Map key , value k , v 중요
		// List는 순서가 중요할때 element 구성원 e 중요
		map.put("sido5", "서울");
		map.put("sido4", "대전");
		map.put("sido3", "대구");
		map.put("sido2", "부산");
		map.put("sido1", "광주");
		map.put("sido0", "하남");
		// element e key k value v(k,v)
		Iterator<String> it = map.keySet().iterator();// Iterator<>에서 다이아몬드는 Key값의 데이터타입을 따라간다.
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "," + map.get(key));
		}
	}

}