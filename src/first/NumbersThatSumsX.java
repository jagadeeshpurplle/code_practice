package first;

import java.util.ArrayList;

public class NumbersThatSumsX {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(9);
		numberList.add(8);
		numberList.add(11);
		numberList.add(13);
		numberList.add(6);
		numberList.add(5);
		numberList.add(14);
		numberList.add(2);
		numberList.add(17);
		numberList.add(3);
		
		int sum = 20, flag = 0;
		for(int i=0;i<numberList.size();i++) { // 10 9
			
			for(int j=0;j<numberList.size();j++) { //9 8  11
				if(i==j) {
					continue;
				}
				if(numberList.get(i) + numberList.get(j) == sum) { // 10 + 11 
					System.out.println(numberList.get(i) +" + "+ numberList.get(j)+ " : "+sum);
					flag =1;
				}
				
				if(numberList.size()-1 == j) {
					numberList.remove(i);
				}
			}
			
		}
		
		if(flag != 1) {
			System.out.println("No numbers that sums "+sum);
		}
		
		
		
	}
	
	
	
}
