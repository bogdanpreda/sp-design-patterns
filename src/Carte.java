import java.util.ArrayList;

public class Carte {
	private String titlu;
	private ArrayList<Autor> autori;
	private ArrayList<Element> capitole;
	public AlignStrategy leftAlignment = new LeftAlignment();
	public AlignStrategy centerAlignment= new CenterAlignment();
	public AlignStrategy rightAlignment = new RightAlignment();
	public AlignStrategy psdAlignmnet = new PSDAlign();
	
	public Carte() {
		this.titlu = "";
		this.capitole =  new ArrayList<Element>();
		this.autori = new ArrayList<Autor>();
	}
	
	public Carte(String numeCarte) {
		this.titlu = numeCarte;
		this.capitole =  new ArrayList<Element>();
		this.autori = new ArrayList<Autor>();
	}
	
	public void accept(DocumentStatVisitor dsv) {
		for(Element elem : capitole) {
			elem.accept(dsv);
		}
	}

	public void print(){
		System.out.println("Titlu: " + this.titlu);
		System.out.println("Autori: ");
		for(Autor autor : this.autori) {
			System.out.print(autor + (autor == this.autori.get(this.autori.size() - 1) ? "\n" : ", "));
		}
		
		for(Element e : this.capitole){
			e.print();
		}
	}

	public String getTitlu() {
		return this.titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autor> autori) {
		this.autori = autori;
	}

	public void addAutor(Autor autor) {
		this.autori.add(autor);
	}

	public void addCapitol(Element e) {
		this.capitole.add(e);
	}

	public ArrayList<Element> getCapitole() {
			return capitole;
	}

	public void setCapitole(ArrayList<Element> capitole) {
		this.capitole = capitole;
	}
	
}
