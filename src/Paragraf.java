import java.util.ArrayList;


public class Paragraf implements Element{
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

	public void add(Element e) throws Exception {
		throw new Exception("Not Supported");
		
	}

	public void remove(Element e) throws Exception {
		throw new Exception("Not Supported");
		
	}

	public Element getElement(int index) throws Exception {
		throw new Exception("Not Supported");
		
	}

	public void print() {
		System.out.println("Paragraf [text=" + text + "]");
	}
	
}
