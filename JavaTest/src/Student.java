
public class Student { //設計student類別, 屬性是student 
    int score; //score 屬性(特徵)
    
    public void play(int hours){ //play方法
    	score-=hours;
    }
    public void study(int hours){ //study方法
    	score+=hours;
    }
    public void showInfo() { //showInfo方法
    	System.out.println(score);
    }
}
