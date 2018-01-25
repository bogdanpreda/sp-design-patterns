
public class Memento {
	private Element savedState;
	
	public Memento(Element stateToSave) {
		this.savedState = stateToSave;
	}
	
	public Element getSavedState() {
		return this.savedState;
	}
}
