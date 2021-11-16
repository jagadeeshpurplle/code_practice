package naveenAutomationLabsJavaInterview;

public class LeadersOfAnIntegerArray {

	public static void main(String[] args) {
		
		findLeaderInAnArray(new int[] {92,13,24,97,0,9});
		findLeaderInAnArray(new int[] {});
		findLeaderInAnArray(new int[] {1});
		
	}
	
	public static void findLeaderInAnArray(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			System.out.println("please give the correct array");
			return;
		}
		
		if(arr.length==1) {
			System.out.println("leader:"+arr[0]);
			return;
		}
		
		int leader = arr[arr.length-1];
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>leader) {
				leader = arr[i];
			}
		}
		
		System.out.println("Leader: "+leader);
		
	}
}
