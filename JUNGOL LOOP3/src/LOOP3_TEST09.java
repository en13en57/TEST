import java.util.Scanner;

/* 반복제어문3 - 형성평가9
 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
 주의! #는 공백으로 구분하되 줄사이에 빈줄은 없다.

3

#
##
###
 ##
  #   
   
 
 */
public class LOOP3_TEST09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("#");
			}
				System.out.println();
			}
		for(i=0;i<n-1;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=n-1;j>i;j--) {
				System.out.print("#");
			}
			System.out.println();
			}
		sc.close();
	}
}
