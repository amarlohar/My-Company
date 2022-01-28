package main;
public class typeCasting {

	public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting");
		//implicit conversion
	
		 // Automatic type conversion
        // long to double type
        char c = 'A';
		
		int i = c;
		 
        // Automatic type conversion
        // Integer to long type
        long l = i;
 
        // Automatic type conversion
        // long to float type
        float f = l;
       
        // Automatic type conversion
        // long to double type
        double d = f;
      
 
        // Print and display commands
        System.out.println("Char value " + c);
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
        System.out.println("Double value " + d);
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double d2 = 100.04;
		 
        // Explicit type casting by forcefully getting
        // data from long datatype to integer type
		
        long l2 = (long)d2;
 
        // Explicit type casting
        int i2 = (int)l2;
        
     // Explicit type casting
        byte b2 = (byte)i2;
 
        // Print statements
        System.out.println("Double value " + d2);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Long value " + l2);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Int value " + i2);
        
     // While printing we will see that
        // fractional part lost
        System.out.println("Byte value " + b2);
		
	}
}
