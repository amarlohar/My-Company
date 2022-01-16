package main;

import java.util.Scanner;

public class ArithmeticCalculater {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double Ans;
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("-------------Calculator-------------");
		System.out.println(" ");
		
		System.out.println("Please Eneter The First Number : ");
		int firstnum=sc.nextInt();
		System.out.println(" ");
		System.out.println("Please Eneter The Second Number : ");
		int secnum= sc.nextInt();
		System.out.println(" ");
		System.out.println("Please press + for Addition ");
		System.out.println(" ");
		System.out.println("Please press - for Substraction ");
		System.out.println(" ");
		System.out.println("Please press * for Multiplication ");
		System.out.println(" ");
		System.out.println("Please press / for Division ");
		System.out.println(" ");
		char op=sc.next().charAt(0);
		double Ans=0;
		switch(op){
		case '+': Ans=firstnum+secnum;
		break;
		case '-':Ans=firstnum-secnum;
		break;
		case '*': Ans=firstnum*secnum;
		break;
		case '/':Ans=firstnum/secnum;
		break;
		}
		System.out.println("The Answer is : " +Ans);
	}
}
