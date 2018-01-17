import java.util.ArrayList;

public class Sectiune extends ObservableElement {
	private String titlu;
	private ArrayList<Element> continutSectiune;

	public Sectiune(String titlu) {
		continutSectiune = new ArrayList<Element>();
		this.titlu = titlu;
	}

	public void add(Element e) throws Exception {
		continutSectiune.add(e);
	}

	public void remove(Element e) throws Exception {
		continutSectiune.remove(e);
	}

	public Element getElement(int index) throws Exception {
		return continutSectiune.get(index);
	}

	public void accept(Visitor v) {
		v.visitSectiune(this);
		this.acceptChildren(v);
	}

	public void acceptChildren(Visitor dsv) {
		for (Element elem : continutSectiune) {
			elem.accept(dsv);
		}
	}

	public void print() {
		System.out.println(titlu);
		for (Element e : continutSectiune) {
			e.print();
		}
	}

	public ArrayList<Element> getContinutSectiune() {
		return continutSectiune;
	}

	public void setContinutSectiune(ArrayList<Element> continutSectiune) {
		this.continutSectiune = continutSectiune;
	}

}
