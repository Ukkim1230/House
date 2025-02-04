package d0120;

public class Arrays3 {
	
	public static void main(String[] args) {
		String[] strs = new String[100];
		// 1,2,짝, 4, 만세,짝, 7,8,짝,만세 : String[10]일때
		//11,12,짝,14,만세,짝,17,18,짝,만세
		//21,22,짝,24,만세,짝,27,28,짝,짝만세
		
			
		for(int i=0; i<strs.length;i++) {
			
			int n1 = (i+1) % 10; //10으로 나눈 나머지
			int n2 = (i+1) / 10; //10으로 나눈 몫
			
			
			if(n2%3==0&&(i+1)%5 ==0&&(i+1)>10 || n2%5==0&&n1%3==0&&n1%10!=0&&(i+1)>10) {
				//짝만세 가 나올경우1 : 30/35/60/64/90/95		
				//나올 경우 2 : 53/56/59
				strs[i] = "짝만세";
			}else if((i+1)%5==0) {
				strs[i] = "만세";
			}else if(n1 %3==0 || (i+1)>10 && n2 %3==0) {
				//앤드연산 우선 
				strs[i] = "짝";
			}else {
				strs[i]=i+1+"";
			}
		}
		
		//String[10]일때
//		for(int i=0; i<strs.length;i++) {
//			if((i+1)%3==0) {
//				strs[i] = "짝";
//			}else if((i+1)%5==0) {
//				strs[i] = "만세";
//			}else {
//				strs[i]=i+1+"";
//			}
//		}
//		for(int i=1; i<strs.length;i++) {
//			strs[i=1]=i+"";
//		}
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(i+1 +"번째 : " + strs[i]);
		}
		
	}

}