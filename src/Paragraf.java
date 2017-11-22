import java.util.ArrayList;


public class Paragraf extends AbstractElement{
	private String text;
	private AlignStrategy alignment;
	
	public Paragraf(String text, AlignStrategy alignment) {
		super();
		this.text = text;
		this.alignment = alignment;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	

	public void accept(Visitor v) {
		v.visitParagraf(this);
	}

	public void print() {
		if(this.alignment == null) {
			System.out.println("*" + this.text);
		} else {
			this.alignment.printAligned(this.text);
		}
		
	}
	
}
