package kr.green.Programmers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
키패드 누르기
이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 
엄지손가락을 사용하는 규칙은 다음과 같습니다.

엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 
더 가까운 엄지손가락을 사용합니다.
4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 
왼손잡이는 왼손 엄지손가락을 사용합니다.
순서대로 누를 번호가 담긴 배열 numbers, 
왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 
각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 
solution 함수를 완성해주세요.

[제한사항]
numbers 배열의 크기는 1 이상 1,000 이하입니다.
numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
hand는 "left" 또는 "right" 입니다.
"left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 
이어붙여 문자열 형태로 return 해주세요.

입출력 예
numbers								hand	result
[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]		"right"	"LLRLLRLLRL"

입출력 예에 대한 설명
입출력 예 #1
순서대로 눌러야 할 번호가 [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]이고, 오른손잡이입니다.
왼손 위치	오른손 위치	눌러야 할 숫자	사용한 손	설명
*	#	1	L	1은 왼손으로 누릅니다.
1	#	3	R	3은 오른손으로 누릅니다.
1	3	4	L	4는 왼손으로 누릅니다.
4	3	5	L	왼손 거리는 1, 오른손 거리는 2이므로 왼손으로 5를 누릅니다.
5	3	8	L	왼손 거리는 1, 오른손 거리는 3이므로 왼손으로 8을 누릅니다.
8	3	2	R	왼손 거리는 2, 오른손 거리는 1이므로 오른손으로 2를 누릅니다.
8	2	1	L	1은 왼손으로 누릅니다.
1	2	4	L	4는 왼손으로 누릅니다.
4	2	5	R	왼손 거리와 오른손 거리가 1로 같으므로, 오른손으로 5를 누릅니다.
4	5	9	R	9는 오른손으로 누릅니다.
4	9	5	L	왼손 거리는 1, 오른손 거리는 2이므로 왼손으로 5를 누릅니다.
5	9	-	-	
따라서 "LRLLLRLLRRL"를 return 합니다.

입출력 예 #2
왼손잡이가 [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]를 순서대로 누르면 사용한 손은 "LRLLRRLLLRR"이 됩니다.

입출력 예 #3
오른손잡이가 [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]를 순서대로 누르면 사용한 손은 "LLRLLRLLRL"이 됩니다.
 */


							// 4행 3열로 생각하고 문제를 푼다.
public class Exam_211222_02 {
	public static void main(String[] args) {

	}
	 public String solution(int[] numbers, String hand) {
	    String answer = "";
        // 왼손과 오른손의 초기 위치
        int left[] = {3, 0}; 
        int right[] = {3, 2};
        // 키패드 0번부터 9번까지의 위치 정보
        int keymap[][] = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        
        for(int i=0;i<numbers.length;i++) {
        	// 눌러야 하는 번호의 위치 정보
        	int key[] = keymap[numbers[i]];
        	// 왼쪽 줄과 오른쪽 줄은 비교할 것 없이 왼손 오른손에 할당
        	if("147".contains(numbers[i]+"")) {  
        		answer += "L";
        		left = key;
        	}else if("369".contains(numbers[i]+"")) {
        		answer += "R";
        		right = key;
    		// 같을 경우 가까운 손을 구해서 할당	
        	}else {
        		int diffLeft = Math.abs(left[0] - key[0]) + Math.abs(left[1] - key[1]);
        		int diffRight = Math.abs(right[0] - key[0]) + Math.abs(right[1] - key[1]);
        		if(diffLeft>diffRight) { // 오른쪽이 짧다면 오른쪽
        			answer += "R";
					right = key;
        		}else if(diffLeft<diffRight) { // 왼쪽이 짧다면 왼쪽
        			answer += "L";
					left = key;
        		}else { // 같으면 왼손잡이/오른손 잡이에 맞춰 할당
        			switch (hand) {
					case "right":
						answer += "R";
						right = key;
						break;
					default:
						answer += "L";
						left = key;
						break;
					}
        		}
        	}
        }  
		return answer;
	}

	@Test
	public void test() {
		assertEquals(new Exam_211222_02().solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},"right"), "LRLLLRLLRRL");
		assertEquals(new Exam_211222_02().solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},"left"), "LRLLRRLLLRR");
		assertEquals(new Exam_211222_02().solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},"right"), "LLRLLRLLRL");
	}
}
