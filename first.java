
class Animal {

	//methods in animal class 
	public  Animal() {
		System.out.println("I am an animal");
	}
	public void eat() {
		System.out.println("I am Eating");
	}
	
	public void sleep() {
		System.out.println("I am Sleeping");
	}
}

 class Bird extends Animal {
	
	 //methods in bird class 
     public Bird() {
		super();
		System.out.println("I am Bird");
	}
	public void eat() {
		System.out.println("I am Eating");
	}
	
	public void sleep() {
		System.out.println("I am Sleeping");
	}
	public void fly() {
		System.out.println("I am flying");
	}
}
 
 public class first {
	 public static void main(String[] args ) {
		 Animal ani = new Animal();
		 Bird b = new Bird();
		 
		 // calling from the animal class.
		 ani.eat();
		 ani.sleep();
		 
		 // calling from the bird class.
		 b.eat();
		 b.sleep();
		 b.fly();
	 }
 }
