import java.util.Stack;

public class UndoCommand implements Command{
	public UndoCommand() {
		
	}

	@Override
	public void execute() {
		Stack<Command> undoBuffer = DocumentManager.getInstance().getUndoBufferInstance();
		Command topCommand = undoBuffer.pop();
		topCommand.unexecute();
	}
	
	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}	
}
