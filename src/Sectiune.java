import java.util.ArrayList;


public class Sectiune implements Element{
	private String titlu;
	private ArrayList<Element> continutSectiune = new ArrayList<Element>();
	
	public void add(Element e) throws Exception {
		continutSectiune.add(e);
	}

	public void remove(Element e) throws Exception {
		continutSectiune.remove(e);
	}

	public Element getElement(int index) throws Exception {
		return continutSectiune.get(index);
	}

	public void print() {
		System.out.println(titlu);
		for(Element e : continutSectiune) {
			e.print();
		}
	}
	
}
