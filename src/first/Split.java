package first;

import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        System.out.println("s: "+s);
        if(s.isEmpty()) {
        	System.out.println("0");
        	return;
        }
        String delims = "[- !,?._'@]+";
        //[ '.,?_!]+
        String[] s1 = s.split(delims);
        System.out.println(s1.length);
        for(int i=0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
        scan.close();
    }
}
