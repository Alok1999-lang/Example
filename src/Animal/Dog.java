package Animal;

public class Dog {
	void eat()
	{
		System.out.println("All dog are good");
	}
  
}
class Puppy extends Dog
{
	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.eat();
	}
}
