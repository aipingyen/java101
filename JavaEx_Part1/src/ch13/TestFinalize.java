package ch13;

class ClassFinalize {
	protected void finalize() {
		System.out.println("finalize方法執行了");
	}
}

public class TestFinalize {
	public static void main(String args[]) {
		ClassFinalize fin = new ClassFinalize();
		fin = null;
		System.out.println("強制進行垃圾收集");
		System.gc();
		//gc()是System類別的Static方法, 所以可以直接用"System"呼叫
		//gc內容會去呼叫finalize(這邊是要證明這件是所以刻意改寫finalize)
		//
	}
}
