package kr.green.Programmers;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

/*
K번째수
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 
모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.

입출력 예
array					commands							return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
입출력 예 설명
[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 */
public class Exam_211227_02 {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length]; // 리턴할 배열의 크기
		for(int i=0; i<commands.length;i++) { // 반복 
			int[] ar = new int[commands[i][1]-commands[i][0]+1]; // 잘라낼 개수 = (두번째 수 - 첫번째 수 + 1)
			//                원본,    시작위치    ,사본,복사위치,      개수
			System.arraycopy(array, commands[i][0]-1, ar, 0, commands[i][1]-commands[i][0]+1);
			Arrays.sort(ar); // 정렬
			answer[i] = ar[commands[i][2]-1]; // 세번째 수가 가져올 위치 : 배열이므로 -1 해야한다.
		}
		return answer;
	}

	@Test
	public void test() {
		assertArrayEquals(new Exam_211227_02().solution(new int[] {1, 5, 2, 6, 3, 7, 4}, 
				new int[][] { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} }), new int[] { 5, 6, 3 });
	}
}
