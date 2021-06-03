package test;

public class GreedyGym {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4};
		int[] b = {1,3,5};
		solution(5,a,b);
		int[] a1= {3};
		int[] b1 = {1};
		solution(3,a1,b1);
	}

    public static void solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n]; //5
        
        for(int i=0;i<n;i++) { 
        	student[i]=1;
        }
        for(int i :lost) {
        	student[i-1]--;
        }
        for(int i :reserve) {
        	student[i-1]++;
        }
        for(int i=0;i<n;i++) {	
        	if(student[i]==0) {	
        		if(i+1<n &&student[i+1]==2) {
        			student[i]++;
        			student[i+1]--;
        		}else if(i-1>0 && student[i-1]==2) {
        			student[i]++;
        			student[i-1]--;
        		}
        	}
        }
        for(int i=0;i<n;i++) {	
        	if(student[i]>0)answer++;
        }
        
        System.out.println(answer);
    }
	
}
