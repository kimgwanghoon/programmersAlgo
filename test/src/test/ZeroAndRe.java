package test;

public class ZeroAndRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i =solution("110010101001");
		System.out.println(i[0]+" "+i[1]);
	}


    public static int[] solution(String s) {
        int[] answer = {0,0};  
        int re=0,zero=0;
        
        while(s.length()!=1){
        	String[] n = s.split("");
            int length=0;
            for(int i=0;i<s.length();i++){
                if("0".equals(n[i])){
                    zero++;
                }else{
                    length++;
                }
            }
            s = Integer.toBinaryString(length);
            re++;
        }
        answer[0]=re;
        answer[1]=zero;
        return answer;
    }

}
