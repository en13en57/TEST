package kr.green.Programmers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
/*
제일 작은 수 제거하기
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, 
solution을 완성해주세요. 
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, 
[10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

입출력 예
arr			return
[4,3,2,1]	[4,3,2]
[10]		[-1]
*/
public class Exam_220111_05 {
	public int[] solution(int[] arr) {
		int[] answer = null;
		if(arr.length==1) { // 배열의 개수가 1개면 {-1} 배열을 리턴
			answer = new int[] {-1};
		}else {
			answer = new int[arr.length-1]; // 1개 적은 배열
			int min = arr[0];
			for(int i : arr) if(min>i) min = i;
			// 최소값을 뺀 값을 배열에 순서를 유지하면서 저장
			int idx=0;
			for(int i : arr) {
				if(i!=min) answer[idx++] = i;
			}
		}
		//System.out.println(Arrays.toString(answer));
		return answer;
	}

	@Test
	public void test() {
		assertArrayEquals(new Exam_220111_05().solution(new int[] {4,3,2,1}), new int[] {4,3,2});
		assertArrayEquals(new Exam_220111_05().solution(new int[] {10}), new int[] {-1});
	}
}
