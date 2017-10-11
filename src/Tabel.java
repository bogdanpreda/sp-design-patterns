
public class Tabel {
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

	@Override
	public String toString() {
		return "Tabel [nume=" + nume + "]";
	}

}
