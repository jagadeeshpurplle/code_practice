
package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MatchPercentage {

	
	public static void main(String args[]){
		
		ArrayList<Object> actual = new ArrayList<Object>();
		actual.add(2);
		actual.add("chitti");
		actual.add("jagadeesh");
		actual.add("prasanna");
		actual.add("chinna");
		actual.add("chinna");
		actual.add("chinna");
		actual.add("chinna");
		actual.add("rashmi");
		ArrayList<Object> required = new ArrayList<Object>();
		required.add("jagadeesh");
		required.add("prasanna");
		required.add("chitti");
		required.add(2);
		required.add(3);
		required.add(4);
		required.add("chinna");
		System.out.println(getMatchPercentage(actual, required));
		
	}	
	
	public static double getMatchPercentage(ArrayList<Object> actual, ArrayList<Object> required) {
		
		Set<Object> actualWithoutDup = new HashSet<>(actual);
		Set<Object> requiredWithoutDup = new HashSet<>(required);

		List<Object> common = new ArrayList<>(actualWithoutDup);
		common.retainAll(requiredWithoutDup);
		System.out.println(common);
		return (requiredWithoutDup.size() == 0 ? 0 : 100.0 * common.size() / requiredWithoutDup.size());

	}
	
	
}

