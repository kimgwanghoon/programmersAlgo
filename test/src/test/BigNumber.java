package test;

import java.util.Arrays;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,10,2,0,0,30,3}; 
		String result= solution(a);
		System.out.println(result);
	}
	
	public static String solution(int[] numbers) {
		
		String answer = "";
		String[] numStr = new String[numbers.length];
		
		for(int i=0;i<numbers.length;i++) {
			numStr[i]=String.valueOf(numbers[i]);
		}
		
		Arrays.sort(numStr, (o1,o2)->(o2+o1).compareTo(o1+o2));
		
		if(numStr[0].equals("0"))return "0";
		
		for(String num:numStr)answer+=num;
		
		
		return answer;
	}

}
