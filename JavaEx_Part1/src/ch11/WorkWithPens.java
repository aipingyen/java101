package ch11;

public class WorkWithPens {
	private Pencil pencil; //不同類別分開宣告
	private InkBrush inkBrush;
	
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) { //不同類別分別傳入
		this.pencil = pencil;
	}
	public InkBrush getInkBrush() {
		return inkBrush;
	}
	public void setInkBrush(InkBrush inkBrush) {
		this.inkBrush = inkBrush;
	}
	
	public void writeWithPencil() { //不同類別分別寫方法
		pencil.write();
	}
	
	public void writeWithInkBrush() {
		inkBrush.write();
	}
}
