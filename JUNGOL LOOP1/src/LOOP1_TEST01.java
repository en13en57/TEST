import java.util.Scanner;

/* 반복제어문1 - 형성평가1
 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
 */
public class LOOP1_TEST01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
	sc.close();
				
	}
}
