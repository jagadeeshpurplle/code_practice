package first;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Concatnate {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
     int i1=scan.nextInt();
     double d1=scan.nextDouble();
     Scanner scan2 = new Scanner(System.in);
     String s1=scan2.nextLine();
     System.out.println(i+i1);
     System.out.println(d+d1);
     System.out.println(s+s1);
        scan.close();
    }
}
