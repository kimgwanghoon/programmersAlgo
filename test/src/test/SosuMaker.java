package test;

public class SosuMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		int[] b = {1,2,7,6,4};
		System.out.println(solution(a));
		System.out.println(solution(b));
		

	}
	
	public static int solution(int[] nums) {
	        int count=0;
	        boolean chk=false;
	        
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                for(int k=j+1;k<nums.length;k++){
	                    int num = nums[i]+nums[j]+nums[k];
	                    chk = sosuChk(num);
	                    if(chk == true){
	                        count++;
	                    }
	                }   
	            }   
	        }
	        return count;
	}
	    
	public static boolean sosuChk(int num){
	        for(int i=2; i<=num/2;i++){
	            if(num%i==0){
	                return false;
	            }
	        }
	        return true;
	}

}
