package part2ch01test;

public class TestCube {

	public static void main(String[] args){
		try{
			Cube c1 = new Cube(0);
			c1.volume();
		}catch(CubeException ec){
			System.out.println(ec.getMessage());
			ec.printStackTrace();
		}
	}
	
}
