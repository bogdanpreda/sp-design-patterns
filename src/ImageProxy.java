import java.awt.Image;


public class ImageProxy extends AbstractElement{
	private String fileName;
	private Image realImage = null;
	
	ImageProxy(String filename) {
		this.fileName = filename;
	}
	
}
