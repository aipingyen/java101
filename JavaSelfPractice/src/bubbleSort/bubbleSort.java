package bubbleSort;

public class bubbleSort {
	public static void bubbleSort(int[] args){
		int i, j, temp, len = args.length;
		for (i=0; i<len-1; i++){
			boolean changed = false;
			for(j=0; j<len-1-i; j++){
				if(args[j]>args[j+1]){
					temp=args[j];
					args[j]=args[j+1];
					args[j+1]=temp;
					changed= true;
				}
			}
			if (changed == false){
				break;
			}
			
		}
		for (i=0; i<len;i++){
			System.out.print(args[i]+" ");
		}
	}
	public static void main(String args[]){
		int[] test = {3,2,1};
		bubbleSort(test);
		
	}
}



