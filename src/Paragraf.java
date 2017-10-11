
public class Paragraf {
	private String text;

	public Paragraf(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Paragraf [text=" + text + "]";
	}
	
}
