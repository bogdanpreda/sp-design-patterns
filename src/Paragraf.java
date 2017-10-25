import java.util.ArrayList;


public class Paragraf extends AbstractElement{
	private String text;
	private ArrayList<Element> elemente;
	
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

	public void print() {
		System.out.println("Paragraf [text=" + text + "]");
	}
	
}
