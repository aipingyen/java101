package part2ch01test;

public class Cube{
	private double length;
	
	public Cube(double length) throws CubeException{
		this.setter(length);
	}
	public void setter(double length) throws CubeException{
		if(length>0){
			this.length=length;
		}else{
			throw new CubeException("正立方體邊長不得為0或是負數");
		}
	}
	public double getter(){
		return length;
	}
	public void volume(){
		System.out.println("體積="+Math.pow(length,3));
		
	}
	
	
}
