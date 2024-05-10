
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Teddy Say : ");
		Animal teddy=new Animal();
		teddy.eat();
		teddy.run();
		System.out.println();
		System.out.println("Sparrow say : ");
		Birds Sparrow=new Birds();
		Sparrow.Fly();
				
	}
		public void eat() {
			System.out.println("	I'm eating Bread ");	
		}
		public void run() {
			System.out.println("	I'm running in to the garden");
		}

}
class Birds
{
	void Fly() {
		System.out.println("	I'm Flying in sky");
	}
}
