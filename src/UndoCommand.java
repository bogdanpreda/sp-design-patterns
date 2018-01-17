public class UndoCommand implements Command{
	public UndoCommand() {
		
	}

	@Override
	public void execute() {
		Element book = DocumentManager.getInstance().getBook();
		
		DocumentStatVisitor visitor = new DocumentStatVisitor();
		book.accept(visitor);
		
		visitor.printStatistica();
	}
	
	public void unexecute() {
				
	}	
}
