import java.util.ArrayList;

public class Subcapitol{
	private String titlu;
	private ArrayList<Paragraf> paragrafe;
	private ArrayList<Imagine> imagini;
	private ArrayList<Tabel> tabele;
	public Subcapitol(String titlu) {
		this.titlu = titlu;
	}
	//ordinea paragraf imagine tabel
	public Subcapitol(String titlu, String textParagraf, String numeImagine, String numeTabel) {
		this.setTitlu(titlu);
		this.addParagraf(textParagraf);
		this.addImagine(numeImagine);
		this.addTabel(numeTabel);
	}
	
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	public void addParagraf(String text) {
		paragrafe.add(new Paragraf(text));
	}
	
	public void addImagine(String nume) {
		imagini.add(new Imagine(nume));
	}

	public void addTabel(String nume) {
		tabele.add(new Tabel(nume));
	}

	public ArrayList<Paragraf> getParagrafe() {
		return paragrafe;
	}

	public ArrayList<Imagine> getImagini() {
		return imagini;
	}

	public ArrayList<Tabel> getTabele() {
		return tabele;
	}
	
	
}
