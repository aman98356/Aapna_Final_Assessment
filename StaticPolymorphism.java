package staticDynamicPolymorphism;

import org.junit.Test;

//Demonstrate static Polymorphism
public class StaticPolymorphism 
{
	//Method OverLoading
	static int sum;
	public void demo() {
		System.out.println("No Parameter");
	}
	public void demo(int a) {
		System.out.println("a :" + a);
	}
	public void demo(int a, int b) {
		sum = a+b;
		System.out.println("addition of a and b : " + sum );
	}
	public void demo(int a , String b) {
		System.out.println("String with integer value : "+ b + " : " + a);
	}

@Test
public void test(){
	StaticPolymorphism sp = new StaticPolymorphism();
	sp.demo();
	sp.demo(10);
	sp.demo(22,45);
	sp.demo(22,"Aman");
	
}
}
