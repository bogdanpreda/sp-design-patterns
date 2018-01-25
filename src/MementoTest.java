
public class MementoTest {

	public static void main(String[] args) {
		Command openCommand = new OpenCommand("f:\\SP\\book.json");
		openCommand.execute();
		DocumentManager.getInstance().getBook().print();
		System.out.println("---------------------------");
		
		Command deleteCommand = new DeleteCommand();
		deleteCommand.execute();
		DocumentManager.getInstance().getBook().print();
		System.out.println("---------------------------");
		
		Command undoCommand = new UndoCommand();
		undoCommand.execute();
		DocumentManager.getInstance().getBook().print();
		System.out.println("---------------------------");
	}
}
