/* 입력 - 자가진단5
 * 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
 * 2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.​
 * 
 */
public class INPUT05 {
	public static void main(String[] args) {
		
		float yd = 91.44f, in = 2.54f;
		float a = 2.1f, b = 10.5f;
		System.out.printf("%.1fyd = %5.1fcm\n", a, a * yd);
		System.out.printf("%.1fin = %5.1fcm", b, b * in);
		
	}
}