import java.util.ArrayList;

public class Capitol {
	private String titlu;
	private ArrayList<Subcapitol> subcapitole;
	
	public Capitol(String titlu) {
		this.titlu = titlu;
	}
	
	public Capitol(String titlu, String titluSubcapitol, String textParagraf, String numeImagine, String numeTabel) {
		this.titlu = titlu;
		Subcapitol subcapitol = new Subcapitol(titluSubcapitol, textParagraf, numeImagine, numeTabel);
		subcapitole.add(subcapitol);
	}
	
	public void addSubcapitol(String titluSubcapitol, String textParagraf, String numeImagine, String numeTabel) {
		subcapitole.add(new Subcapitol(titluSubcapitol, textParagraf, numeImagine, numeTabel));
	}
	
	public void addSubcapitol(Subcapitol subcapitol) {
		subcapitole.add(subcapitol);
	}
	
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Subcapitol> getSubcapitole() {
		return subcapitole;
	}
	
	
}
