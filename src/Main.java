import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) throws Exception {
		Autor autor = new Autor("Autor1");
		Autor autor2 = new Autor("Autor2");


		DocumentStatVisitor dsv = new DocumentStatVisitor();
		
		Carte carte = new Carte("nume carte");
		
		Subject subject = new Subject();

		ChangeMonitor changeMonitor = new ChangeMonitor();
//		subject.attach(changeMonitor);
//		subject.setState("asdfaf");
		
		carte.addAutor(autor);
		carte.addAutor(autor2);
		Sectiune s1 = new Sectiune("Sectiune 1");
		s1.add(new Imagine("img1.jpg"));
		
		s1.add(new Paragraf("Lorem ipsum", carte.centerAlignment, changeMonitor));
		s1.add(new Paragraf("Lorem ipsum.....", carte.leftAlignment, changeMonitor));
		s1.add(new Paragraf("Lorem ipsum2....", carte.leftAlignment, changeMonitor));
		s1.add(new Paragraf("Lorem ipsum2....", carte.psdAlignmnet, changeMonitor));
		//s1.acceptChildren(dsv);
		
		Sectiune s2 = new Sectiune("Sectiune2");
		s2.add(new Imagine("img2.jpg"));
		s2.add(new Paragraf("Lorem ipsum part 2.....", carte.rightAlignment, changeMonitor));
		s2.add(new Paragraf("Lorem ipsum2 part2....", carte.rightAlignment, changeMonitor));
		//s2.acceptChildren(dsv);
		
		
		
		carte.addCapitol(s1);
		carte.addCapitol(s2);

		carte.print();

		carte.accept(dsv);
		System.out.println("\nStatistica visited: ");
		dsv.printStatistica();
		System.out.println("-------------------------------------");
		
		Command openCommand = new OpenCommand("f:\\SP\\book.json");
		openCommand.execute();
		DocumentManager.getInstance().getBook().print();
		
		Command statisticsCommand = new StatisticsCommand();
		System.out.println("\nStatistica: ");
		statisticsCommand.execute();
		
		Command classToJSONCommand = new ClassToJSONCommand();
		classToJSONCommand.execute();
		
		System.out.println("------------------------------------------------");
		//Tema: Builder si saveVisitor;
/*
		Command nscmd = new NewSampleCommand();
		nscmd.execute();

		Element book = DocumentManager.getInstance().getDocument();
		book.print();

		delCmd.execute();
		book.print();
		
		Command undoCmd = new UndoCommand();
		undoCmd.execute();
		
		book = DocumentManager.getInstance().getDocument();
		book.print();
		*/
	}
}
