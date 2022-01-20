package hackerrank;

public class OpenText {
	 public static int flip(int ch) {
		  return (ch == 0) ? 1 : 0;
		 }

		 public static int getFlipWithStartingCharcter(int[] coinSeq, int expected) {
		  int flipCount = 0;
		  for (int i = 0; i < coinSeq.length; i++) {

		   if (coinSeq[i] != expected)
			   flipCount++;
   
		   expected = flip(expected);

		  }
		  return flipCount;
		 }

		 public static int minFlipToMakeStringAlternate(int[] coinSeq) {
		    return Math.min(getFlipWithStartingCharcter(coinSeq, 0), getFlipWithStartingCharcter(coinSeq, 1));
		 }

		 public static void main(String[] args) {
			 OpenText c = new OpenText();

		  int[] coinSeq = { 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1 };
		   //int[] coinSeq = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 }; --7 min flips
		   //int[] coinSeq = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 }; --9 max flips

		   
		  System.out.println("Number of min flips required to make coin seq are "+minFlipToMakeStringAlternate(coinSeq));

		 }
		 
		

}
