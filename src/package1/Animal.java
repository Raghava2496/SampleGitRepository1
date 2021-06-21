package package1;

public class Animal {
	void eat()
	{
		System.out.println("eating...");
		}  
	}  
	class Dog2 extends Animal
	{  
	void bark()
	{
		System.out.println("barking...");
		}  
	}  
	class TestInheritance
	{  
	public static void main(String args[])
	{  
	Dog2 d=new Dog2();  
	d.bark();  
	d.eat();  
	}}
	

