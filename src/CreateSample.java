
public class CreateSample implements Command{
	public CreateSample() {
		
	}
	
	@Override
	public void execute() {
		Element myBook = new Sectiune("Section from CreateSample");
		try {
			myBook.add(new Paragraf("this is a text paragraph", null));
			myBook.add(new Tabel("tabel5"));
			DocumentManager.getInstance().setBook(myBook);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
}
