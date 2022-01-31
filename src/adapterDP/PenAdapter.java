package adapterDP;

public class PenAdapter implements Pen{

	PilotPen p = new PilotPen();

	public void write(String assignment) {
		p.mark(assignment); 
	}

}
