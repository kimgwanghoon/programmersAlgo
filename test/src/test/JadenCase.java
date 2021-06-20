package test;

public class JadenCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = solution("3people unFollowed me");
		System.out.println(a);
	}
	
    public static String solution(String s) {
        String answer = "";
        int tmp;
        for(int i=0; i<s.length();i++){
            tmp=(int)s.charAt(i);
            int charAt = 0;
            if(i!=0) {
            	charAt = (int)s.charAt(i-1);
            }
            
			if(i==0 || charAt==32){
                if(97<=tmp && tmp<=122){
                    answer +=(char)(tmp-32);
                }else{
                    answer +=(char)tmp;
                }
            }else{
                if(65<=tmp && tmp<=90){
                    answer +=(char)(tmp+32);
                }else{
                    answer +=(char)tmp;
                }
            }
        }
        return answer;
    }

}

