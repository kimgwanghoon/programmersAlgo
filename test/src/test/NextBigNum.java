package test;

public class NextBigNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(78));
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
        int answer = n;
        int count=0,next_count=0;
        String a2 = Integer.toBinaryString(n);
        
        count=countOne(a2);
        
        while(true){
            answer++;
            a2=Integer.toBinaryString(answer);
            next_count=countOne(a2);
            if(count==next_count){
                break;
            }   
        }
        
        return answer;
    }
    
    public static int countOne(String count){
        int count_a=0;
        for(int i=0;i<count.length();i++){
            char a = count.charAt(i);
            if(a=='1'){
                count_a++;
            }
        }
        return count_a;
    }

}
