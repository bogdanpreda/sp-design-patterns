
public class Originator {
	private Element state;

	public void set(Element state) {
		this.state = state;
	}

	public Memento saveToMemento() {
		return new Memento(state);
	}

	public void restoreFromMemento(Memento m) {
		state = m.getSavedState();
	}
}
