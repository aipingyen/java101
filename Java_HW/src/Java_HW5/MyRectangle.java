package Java_HW5;

public class MyRectangle {
	double width;
	double depth;
	MyRectangle(){
	}
	MyRectangle(double width, double depth){
		this.width=width;
		this.depth=depth;
	}
	void setWidth(double width){
		this.width=width;
	}
	void setDepth(double depth){
		this.depth=depth;
	}
	double getArea(){
		return width*depth; 
	}
	
}
