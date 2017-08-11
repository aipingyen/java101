package ch11;

public class WorkWithPens2 {
	private IWritable writable; //用介面類別宣告物件writable

	public IWritable getWritable() {
		return writable;
	}

	public void setWritable(IWritable writable) { //不同類別物件都可以傳入, 以定義writable
		this.writable = writable;
	}
	
	public void writeWithPens() { 
		//designtime: 用writable呼叫抽象write 
		//runtime: writable已傳入的不同類別物件, 所以會呼叫各種類別實現的write
		writable.write();
	}
}
