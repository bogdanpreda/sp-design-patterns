
public class Imagine extends ObservableElement{
	private String nume;
//	private ImageData data;
	
	public Imagine(String nume) {
		super();
		this.nume = nume;
//		data = this.loadFromFIle(filename);
		this.setState("added image");
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}


	public void accept(Visitor v) {
		v.visitImage(this);
	}
	
	public void print() {
		System.out.println("Imagine [nume=" + nume + "]");
		
	}
	
//	public void loadFromFile(filename) {
//		//data loader
//	}
	
}
