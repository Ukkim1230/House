package d0120;

public class Constructor { //생성자 : 클레스 명과 이름이 같고, 데이터 타입이 없다.(반환값이 없다)
	public Constructor() { //자바가 자동으로 만들어줌
		System.out.println("어? 내 메모리를 생성했구나~"); //메모리가 생성할 때 실행됨
		
	}
	
	
	public static void main(String[] args) {
		Constructor c = new Constructor(); //메모리가 생성될 때 생성됨 = 생성자
		c = new Constructor();
		//java는 소멸자가 없다
		//자바파일을 생성할때 1MB를 쓴다고 가정할때, 1000개를 생성하면 1G를 쓴다.
		//4G컴퓨터라고 생각하고 -(2G 운영체제) 
		//java는 필요없는 걸 자동으로 삭제 
		//이거의 반대 개념이 <메모리 누수>
		//가비지 컬렉트
			
	}

}