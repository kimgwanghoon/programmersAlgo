package test;

import java.util.Arrays;

public class Lottos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {44, 1, 0, 0, 31, 25},b= {31, 10, 45, 1, 6, 19};
		solution(a,b);
		int[] a1= {45, 4, 35, 20, 3, 9},b1= {20, 9, 3, 45, 4, 35};
		solution(a1,b1);
	}
	
	public static void solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        for(int i :lottos) {
        	if(i==0)answer[0]++;
        	else {
        		for(int j:win_nums) {
        			if(i==j) {
        				answer[0]++;
        				answer[1]++;
        				break;
        			}
        		}
        	}
        }
        
        for(int i =0;i<answer.length;i++) {
        	answer[i]=Math.min(7-answer[i], 6);
        	
        }
        
        
       System.out.println(Arrays.toString(answer));
    }

}
