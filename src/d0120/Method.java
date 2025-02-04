package d0120;

public class Method {
	
	int i = 1;
	
	void test() { //선언
		//초기화?같은거 
		System.out.println(i);//멤버변수
		
		int i=2;
		System.out.println(i);//멤버변수가 아니다
		
	}
	
	int test(int i) {//매개변수 까지 test명으로 쓰기 때문에 이름만 같은 건 괜찮음
		return 1;
	}
	
	
	
	//메소드 = 선언 + 실행 
	//변수 = 선언 + 실행 + 초기화
	//초기화 = 대입 

}