package p0211;

import java.util.HashMap;

public class MapTest2 {// map 은 순서가 없다(입력한대로 출력되지 않는다
	
	public static void main(String[] args) {//다양한 데이터타입을 사용할 수 없음
		HashMap<String,String> map = new HashMap<>();
		map.put("name","홍길동");
		map.put("age","33");
		map.put("address","한양");
		map.put("job","도적");
		System.out.println(map);
	}
}