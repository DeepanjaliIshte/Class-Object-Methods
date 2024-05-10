// By Using method

public class Animal_2 {

	String Color;
	int Age;
	
	void initObj(String c,int a)
	{
		Color=c;
		Age=a;
	}
	void display()
	{
		System.out.println(Color+" "+Age+"");
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_2 teddy=new Animal_2();
		teddy.initObj("Brown", 4);;
		teddy.display();
		
	}

}


