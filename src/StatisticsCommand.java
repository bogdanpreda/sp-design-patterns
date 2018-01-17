
public class StatisticsCommand implements Command{
	public StatisticsCommand() {
		
	}

	@Override
	public void execute() {
		Element book = DocumentManager.getInstance().getBook();

		DocumentStatVisitor dsv = new DocumentStatVisitor();
		book.accept(dsv);
		
		dsv.printStatistica();
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
	
	
}
