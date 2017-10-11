import java.util.ArrayList;

public class Carte {
	private String nume;
	private ArrayList<Autor> autori;
	private Cuprins cuprins;
	private ArrayList<Capitol> capitole;
	
	public Carte(String numeCarte) {
		this.nume = numeCarte;
	}
	
	public Carte(String numeCarte, Autor autor, Cuprins cuprins) {
		this.nume = numeCarte;
		this.autori.add(autor);
		this.cuprins = cuprins;	
	}
	
	public Carte(String numeCarte, String numeAutor, String numeCuprins, String titluCapitol, String titluSubcapitol, String textParagraf, String numeImagine, String numeTabel) {
		this.nume = numeCarte;
		this.autori.add(new Autor(numeAutor));
		this.cuprins = new Cuprins(numeCuprins);
		this.capitole.add(new Capitol(titluCapitol, titluSubcapitol, textParagraf, numeImagine, numeTabel));
	}
	
	public void addCapitol(String titlu, ArrayList<Subcapitol> subcapitole) {
		Capitol capitol = new Capitol(titlu);
		for(Subcapitol subcapitol : subcapitole) {
			capitol.addSubcapitol(subcapitol);
		}
	}
	
}
