
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
	
	
}
