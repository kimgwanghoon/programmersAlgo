package test;

import java.util.Arrays;

public class NoFinish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"leo", "kiki", "eden"};
		String[] b= {"eden", "kiki"};
		solution(a,b);

		String[] a1= {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b1= {"josipa", "filipa", "marina", "nikola"};
		solution(a1,b1);
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0;i<completion.length;i++) {
        	if(!participant[i].equals(completion[i])) {
        		answer=participant[i];
        		break;
        	}
        	if(i+1==completion.length) {
        		answer=participant[i+1];
        	}
        }
        
        return answer;
    }

}
