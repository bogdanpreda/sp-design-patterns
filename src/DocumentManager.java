import java.util.Stack;

public class DocumentManager {
	private static DocumentManager instance = null;
	private Stack<Command> undoBuffer = new Stack<Command>();
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
	
	public Stack<Command> getUndoBufferInstance() {
		return this.undoBuffer;
	}
}
