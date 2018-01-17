
public class DocumentManager {
	private static DocumentManager instance = null;
	private Element book;
	private DocumentManager() {
		
	}
	
	public static DocumentManager getInstance() {
		if (instance == null) {
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public void setBook(Element book) {
		 this.book = book;
	}
	
	public Element getBook() {
		return this.book;
	}
	
}
