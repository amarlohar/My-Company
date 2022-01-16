package main;

//1. Class is having Default access modifier 
class defAccessSpecifier
{ 
void display() 
   { 
       System.out.println("You are using defalut access specifier"); 
   } 
} 

public class AccessModifiers {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
      obj.display(); 

	}
}


//2. using private access specifiers
class priaccessspecifier 
{ 
 private void display() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
} 















//create another package
