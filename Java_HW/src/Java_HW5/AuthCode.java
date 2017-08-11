package Java_HW5;

public class AuthCode {
	public static void main(String[] args){
		AuthCode myCode = new AuthCode();
		myCode.genAuthCode();
	}
	void genAuthCode(){
		char[] c = new char[8]; //產生8碼
		for(int i = 0; i < c.length; i++){
			
			int r = (int)(Math.random()*62); 
			//r:0~61 (10數字+26大寫+26小寫:共62種可能性)
			
			if(r < 10){
				c[i]=(char)(r+48); 	//unicode:48~57 數字
			}else if(r >=10 && r<36){
				c[i]=(char)(r-10+65); 	//unicode:65~90 大寫英文
			}else{
				c[i]=(char)(r-10-26+97);	//unicode:97~122 小寫英文
			}
			System.out.print(c[i]);
		}
	}
	
}
