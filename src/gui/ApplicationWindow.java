package gui;

public class ApplicationWindow extends Window{
	
	private String title;
	private String border;
	
//	private  Document content;
	
	public ApplicationWindow(String title) {
		impl = new SwingImpl();
		impl.setTitle(title);
	}
}
