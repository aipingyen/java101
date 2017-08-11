package ch05;

import java.util.Scanner;

public class RegTestID {

	public static void main(String[] args) {
		String ID = "[A-za-z][12]\\d{8}"; //身分證字號的一種Regular Expression
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an ID number of Taiwan:");
		String sampleID = sc.next();
		if(sampleID.matches(ID)){
			System.out.println("This is an ID number of Taiwan.");
		}else{
			System.out.println("wrong format");
		}
		sc.close();
	}

}
