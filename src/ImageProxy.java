
public class ImageProxy extends AbstractElement{
	private String fileName;
	private Imagine realImage = null;
	
	ImageProxy(String filename) {
		this.fileName = filename;
	}
	

	public void accept(Visitor v) {
//		v.visitImageProxy(this);
	}
	
	public void print(){
		if(realImage == null){
			realImage = new Imagine(fileName);
		}
		realImage.print();
	}
}
