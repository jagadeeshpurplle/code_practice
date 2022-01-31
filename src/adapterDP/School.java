package adapterDP;

public class School {

	public static void main(String[] args) {
	
		Pen pen = new PenAdapter();
		AssignmentWork asw = new AssignmentWork();
		asw.setPen(pen);
		asw.writeAssignment("writing");
	}
}
