import java.util.ArrayList;
import java.util.List;

public class Subject {
	protected List<Observer> observables = new ArrayList<Observer>();
	
	private String state;
	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		this.notif(this);
	}
	
	public void attach(Observer o) {
//		System.out.println("Attached");
		this.observables.add(o);
	}
	
	public void detach(Observer o) {
		this.observables.remove(o);
	}
	
	public void notif(Object o) {
		System.out.println("Running update [" + observables.size() + "] " + ((Subject) o).getState());
		for( Observer obs : observables) {
			obs.update(o);
		}
	}
}
