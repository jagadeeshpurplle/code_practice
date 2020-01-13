package first;

import java.util.ArrayList;
import java.util.List;

public class MaxMinNum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long totalSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum = totalSum+arr[i];
        }
        final List<Long> data = new ArrayList<Long>();
        for(int j=0;j<arr.length;j++){
            data.add((long) (totalSum-arr[j]));
        }

        long max = data.get(0),  min= data.get(0);
        for(int l=0;l<data.size();l++){
            if(data.get(l)>max){
                max = data.get(l);
            }else if(data.get(l)<min){
                min = data.get(l);
            }
        }
        System.out.println(Math.abs(min)+" "+Math.abs(max));
    }
    
    public static void main(String args[]) {
    	int[] a = {426980153,354802167,142980735,968217435,734892650};
//      	int[] a = {1,2};
    	miniMaxSum(a);
    	//1659655705 2484892405
    }
    
}
