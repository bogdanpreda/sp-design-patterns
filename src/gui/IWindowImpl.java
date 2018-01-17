package gui;

public interface IWindowImpl {
	void setTitle(String title);
	void show();
	void setSize(Size s);
	Size getScreenSize();
}
