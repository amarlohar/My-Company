package main;

public class AbstractionDemo {

	public static void main(String[] args) {
		
//		Human human = new Human();//Can't do it now : abstract
		
		Onkar onkar = new Onkar();
		
		onkar.eat();
		onkar.run();
		onkar.breathe();
		
		Mayur mayur = new Mayur();
		mayur.eat();
		mayur.run();
		
	}

}

abstract class Human{
	abstract void eat();
	abstract void run();
	
	void breathe() {
		System.out.println("Generic breathe...");
	}
}

class Onkar extends Human{
	@Override
	void eat() {
		System.out.println("Onkar's own way of eating...");
		
	}
	
	@Override
	void run() {
		System.out.println("Onkar's distinguished style of running....");
		
	}
}

class Mayur extends Human{
	@Override
	void eat() {
		System.out.println("mayur's eat...");
		
	}
	
	@Override
	void run() {
		System.out.println("mayur runs fast...");
		
	}
}




