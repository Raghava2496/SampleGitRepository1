package package1;

class Multilevel
{  
void eat()
{
	System.out.println("eating...");
	}  
}  
class Second extends Multilevel
{  
void bark()
{
	System.out.println("barking...");
	}  
}  
class Third extends Second
{  
void weep()
{
	System.out.println("weeping...");
	}  
}  

class TestInheritance2
{  
public static void main(String args[])
{  
Third d=new Third();  
d.weep();  
d.bark();  
d.eat();  
}
}  