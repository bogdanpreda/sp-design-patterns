package gui;

public class SwingImpl implements IWindowImpl{

	private String title;
	private Size size;
	
	@Override
	public void setTitle(String title) {
		this.title = title;
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(Size s) {
		this.size = s;
		
	}

	@Override
	public Size getScreenSize() {
		return this.size;
	}

}
