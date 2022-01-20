package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Jagadeesh implements Comparable<Jagadeesh>{
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	String name;
	int id;
	Double salary;
	
	public Jagadeesh(String name, int id, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public int compareTo(Jagadeesh o) {
		if(this.getId() > o.getId()) {
			return 1;
		}else {
			return -1;
		}
	}
	
}


public class ComparableComprator{

	public static void main(String[] args) {
		List<Jagadeesh> list = new ArrayList<Jagadeesh>();
		list.add(new Jagadeesh("jagadeesh", 100, 10000.0));
		list.add(new Jagadeesh("surendra", 99, 70000.0));
		list.add(new Jagadeesh("Abhi", 787, 30000.0));
		

		
		Comparator<Jagadeesh> com = new Comparator<Jagadeesh>() {
			
			@Override
			public int compare(Jagadeesh o1, Jagadeesh o2) {
				if(o1.getId()>o2.getId()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(list, com);
//		Collections.sort(list);
		
		for(Jagadeesh jag : list) {
			System.out.println(jag.getId()+" "+jag.getName()+" "+jag.getSalary());
		}
	}	
}
