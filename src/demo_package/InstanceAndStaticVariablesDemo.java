package demo_package;

public class InstanceAndStaticVariablesDemo {
	// instance variable
	int x, y;

	double z;

	boolean flag;

	// static or class variable
	static long m = 120;

	public static void main(String[] args) {
		int i = 11;
//		System.out.println(i);
		InstanceAndStaticVariablesDemo object = new InstanceAndStaticVariablesDemo();
		InstanceAndStaticVariablesDemo object2 = new InstanceAndStaticVariablesDemo();

		// constructor
		// setter method
		// initialization blocks

		object.x = 10;
		object.y = 20;
		object.z = 30.5;
		object.flag = true;

		object2.x = 11;
		object2.y = 21;
		object2.z = 31.5;
		object2.flag = true;

		System.out.println("x : " + object.x);
		System.out.println("y : " + object.y);
		System.out.println("z : " + object.z);
		System.out.println("flag : " + object.flag);
		System.out.println("m : " + InstanceAndStaticVariablesDemo.m);

		System.out.println("******************************************************************");

		System.out.println("x : " + object2.x);
		System.out.println("y : " + object2.y);
		System.out.println("z : " + object2.z);
		System.out.println("flag : " + object2.flag);
		System.out.println("m : " + InstanceAndStaticVariablesDemo.m);
	}

}
//CTRL+SHIFT+B -> setting breakpoints
