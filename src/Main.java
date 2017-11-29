
public class Main {
	public static void main(String[] args) throws Exception {
		Autor autor = new Autor("Autor1");
		Autor autor2 = new Autor("Autor2");
		

		DocumentStatVisitor dsv = new DocumentStatVisitor();
		
		Carte carte = new Carte("nume carte");
		carte.addAutor(autor);
		carte.addAutor(autor2);
		Sectiune s1 = new Sectiune("Sectiune 1");
		s1.add(new Imagine("img1.jpg"));

		s1.add(new Paragraf("Lorem ipsum", carte.centerAlignment));
		s1.add(new Paragraf("Lorem ipsum.....", carte.leftAlignment));
		s1.add(new Paragraf("Lorem ipsum2....", carte.leftAlignment));
		s1.add(new Paragraf("Lorem ipsum2....", carte.psdAlignmnet));
		s1.acceptChildren(dsv);
		
		Sectiune s2 = new Sectiune("Sectiune2");
		s2.add(new Imagine("img2.jpg"));
		s2.add(new Paragraf("Lorem ipsum part 2.....", carte.rightAlignment));
		s2.add(new Paragraf("Lorem ipsum2 part2....", carte.rightAlignment));
		s2.acceptChildren(dsv);
		
		carte.addCapitol(s1);
		carte.addCapitol(s2);

		carte.print();

		carte.accept(dsv);
		System.out.println("\nStatistica visited: ");
		dsv.printStatistica();
		System.out.println();
		
//		ArrayList<Subcapitol> subcapitole;
//		carte.addCapitol("Capitolul1", subcapitole);
		
//		Builder builder = new JSONBuilder("/home/bogdanp/Univ/SP/book.json");
		
		Command openCommand = new OpenCommand("f:\\SP\\book.json");
		openCommand.execute();
		DocumentManager.getInstance().getBook().print();
		
		Command statisticsCommand = new StatisticsCommand();
		System.out.println("\nStatistica: ");
		statisticsCommand.execute();
		
		
		//Tema: Builder si saveVisitor;
	}
}
