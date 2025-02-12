package p0204;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] nums = new int[6];  // 6개의 숫자를 저장할 배열
        Random r = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(6) + 1; // 1~45 범위의 난수 생성

            // 중복 검사  
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) { 
                    i--; // 중복 발생 시 다시 생성
                    break;
                }
            }
        }

        // 배열 출력 (Arrays.toString() 사용하지 않음)
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]); // 마지막 숫자는 쉼표 없이 출력
            } else {
                System.out.println(nums[i]);
            }
        }
    }
}
