import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Autor autor = new Autor("nume autor");
		Cuprins cuprins = new Cuprins("Nume cuprins");
		
		Carte carte = new Carte("nume carte", autor, cuprins);
		
		Sectiune s1 = new Sectiune();
		
		c.add(s1);
		
//		ArrayList<Subcapitol> subcapitole;
//		carte.addCapitol("Capitolul1", subcapitole);
	}
}
