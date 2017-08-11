package part2ch01test;

public class C {
	private double length;
	public C(){		
	}
	public C(double length){
		try{
			if(length<=0){
				throw new CException("邊長要>0才對");
			}
			System.out.println("體積:"+Math.pow(length, 3));
	 		
		}catch(CException e){
			e.printStackTrace();
			
		}	
	}

	

}
