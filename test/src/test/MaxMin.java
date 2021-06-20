package test;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution("1 2 3 4");

	}
	

    public static String solution(String s) {
        String answer = "";
        int[] a = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(a);
        answer=a[0]+" "+a[a.length-1];
        System.out.println(answer);
        return answer;
    }

}
