
public interface Visitor {
	public void visitImageProxy(Imagine img);
	public void visitImage(Imagine img);
	public void visitParagraf(Paragraf paragraf);
	public void visitTabel(Tabel tabel);
	public void visitSectiune(Sectiune sectiune);
}
