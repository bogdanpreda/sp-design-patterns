import java.util.ArrayList;
import java.util.Stack;

public class DeleteCommand implements Command, Cloneable{

	private Memento memento;
	
	@Override
	public void execute() {
		Stack<Command> undoBuffer = DocumentManager.getInstance().getUndoBufferInstance();
		Element bookM = DocumentManager.getInstance().getBook();
		Element book = DocumentManager.getInstance().getBook();
		
		this.memento = new Memento(book);
		
		ArrayList<Element> continutSectiune = ((Sectiune) book).getContinutSectiune();
//		System.out.println(continutSectiune.size());
		try {
			for(int i = 0; i < continutSectiune.size(); i++) {
				((Sectiune)book).remove(book.getElement(i));
				i--;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		undoBuffer.push(this);
	}

	@Override
	public void unexecute() {
		DocumentManager.getInstance().setBook(this.memento.getSavedState());
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}

}
