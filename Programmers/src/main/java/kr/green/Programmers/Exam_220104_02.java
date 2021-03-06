package kr.green.Programmers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
가운데 글자 가져오기
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
*/
public class Exam_220104_02 {

	public String solution(String s) {
		String answer = "";
		if(s.length()%2==0) {
			answer = s.substring(s.length()/2-1,s.length()/2+1);
		}else {
			answer = s.charAt(s.length()/2)+""; // charAt으로 받으면 char 이므로 +""을 더해 string으로 만들어줬다. 
		}
		System.out.println(answer);
		return answer;
	}

	@Test
	public void test() {
		assertEquals(new Exam_220104_02().solution("abcde"),"c");
		assertEquals(new Exam_220104_02().solution("qwer"),"we");
	}
}
