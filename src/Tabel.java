
public class Tabel extends ObservableElement{
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

	public void print() {
		System.out.println("Tabel [nume=" + nume + "]");
		
	}

	public void accept(Visitor v) {
		v.visitTabel(this);
	}

}
