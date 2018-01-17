
public class OpenCommand implements Command{
	private String fileName;
	
	public OpenCommand(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void execute() {
		Builder builder = new JSONBuilder(this.fileName);
		builder.buildPart();
		
		Element book = builder.getRest();

		DocumentManager.getInstance().setBook(book);
	}
	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
