package Java_HW8;



public class Train implements Comparable<Train>{
	int number;
	String type, start, dest;
	double price;
	
	public Train(){
		
	}
	public Train(int number, String type, String start, String dest, double price){
		this.setTrain(number, type, start, dest, price);
	}
	public void setTrain(int number, String type, String start, String dest, double price){
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	public int getNumber(){
		return number;
	}
	public String getType(){
		return type;
	}
	public String getStart(){
		return start;
	}
	public String getDest(){
		return dest;
	}
	public double getPrice(){
		return price;
	}
	public int compareTo(Train aTrain) {
		//物件本身與 aEmployee 相比較，如果 retrun 正值，就表示比 aEmployee 大
		if (this.number < aTrain.number) {
			return 1;
		} else if(this.number == aTrain.number){
			return 0;
		}
		else{
			return -1;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
	
}
