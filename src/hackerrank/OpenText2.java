package hackerrank;


public class OpenText2 {
	
	public static void main(String[] args) {
		System.out.println(solution("BAAAB"));
	}

     public static int solution(String S) {

         int MinimumCount =0; int BCount =0;
         for(Character ch : S.toCharArray()){
             if(ch == 'A'){
                 MinimumCount = Math.min(BCount, MinimumCount+1);
             }else{
                 BCount++;
             }
         }
         return MinimumCount;
     }
     
     public static int getSolution(String s) {
    	 
    	 int bCount =0;int minimumCount = 0;
    	 for(int i=0;i<s.length();i++) {
    		 if(s.charAt(i) == 'A') {
    			 minimumCount = Math.min(bCount, minimumCount+1);
    		 }else {
    			 bCount++;
    		 }
    	 }
    	 return minimumCount;
     }
 }


