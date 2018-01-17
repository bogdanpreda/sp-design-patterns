import java.util.Collection;

public interface Element {
	
	public void add(Element e) throws Exception;
	public void remove(Element e) throws Exception;
	public Element getElement(int index) throws Exception;	
	public void print();
	public void accept(Visitor v);
}
