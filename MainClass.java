package Inheritance;

public class MainClass {
	public static void main(String args[]) {
		Dog lab = new Dog();
			lab.name="Spike";
			lab.Display();
			lab.eat();
		Cat c = new Cat();
			c.name="Scamp";
			c.Display();
			c.Sleep();
		Rabbit r = new Rabbit();
			r.name="Chestar";
			r.Display();
			r.Play();
	}
	
		
}
