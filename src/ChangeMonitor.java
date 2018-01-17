
public class ChangeMonitor implements Observer{

//	protected Subject subject;

//	public ChangeMonitor(Subject subject) {
//		this.subject = subject;
//	    this.subject.attach(this);
//	}
	
	public ChangeMonitor() {
	
	}
	@Override
	public void update(Object o) {

	      System.out.println("Change:" + ((Subject) o).getState());
		
	}
	
}
