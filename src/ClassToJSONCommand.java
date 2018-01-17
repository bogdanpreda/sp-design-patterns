import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassToJSONCommand implements Command{
	public ClassToJSONCommand() {
		
	}

	@Override
	public void execute() {
		Element book = DocumentManager.getInstance().getBook();

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		System.out.println(gson.toJson(DocumentManager.getInstance().getBook()));
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
	
	
}
