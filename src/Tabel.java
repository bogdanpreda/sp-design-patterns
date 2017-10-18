
public class Tabel implements Element{
	private String nume;

	public Tabel(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
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
		System.out.println("Tabel [nume=" + nume + "]");
		
	}

}
