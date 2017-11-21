
public class Main {
	public static void main(String[] args) throws Exception {
		Autor autor = new Autor("nume autor");
		Cuprins cuprins = new Cuprins("nume cuprins");
		
		Carte carte = new Carte("nume carte"	, cuprins);
		carte.addAutor(autor);

		Sectiune s1 = new Sectiune("Sectiune 1");
		s1.add(new Imagine("img1.jpg"));

		s1.add(new Paragraf("Lorem ipsum", carte.centerAlignment));
		s1.add(new Paragraf("Lorem ipsum.....", carte.leftAlignment));
		s1.add(new Paragraf("Lorem ipsum2....", carte.leftAlignment));
		
		Sectiune s2 = new Sectiune("Sectiune2");
		s2.add(new Imagine("img2.jpg"));
		s2.add(new Paragraf("Lorem ipsum part 2.....", carte.rightAlignment));
		s2.add(new Paragraf("Lorem ipsum2 part2....", carte.rightAlignment));

		carte.addCapitol(s1);
		carte.addCapitol(s2);

		carte.print();

//		ArrayList<Subcapitol> subcapitole;
//		carte.addCapitol("Capitolul1", subcapitole);
	}
}
