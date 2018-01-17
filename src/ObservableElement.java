import javax.swing.text.DefaultStyledDocument.ElementBuffer;

public abstract class ObservableElement extends Subject implements Element {

	public void add(Element e) throws Exception {
		throw new Exception("Not Supported");
		
	}

	public void remove(Element e) throws Exception {
		throw new Exception("Not Supported");
		
	}

	public Element getElement(int index) throws Exception {
		throw new Exception("Not Supported");
	}
	
	
}
