package gui;

public abstract class Window {
	IWindowImpl impl;
	
	public void minimize() {
		Size s = new Size(0, 0);
		impl.setSize(s);
		impl.show();
	}
	
	public void maximize() {
		Size s = impl.getScreenSize();
		impl.setSize(s);
		impl.show();
	}
	
	public void refresh() {
		
	}
	
	public void getContext() {
		
	}
}
