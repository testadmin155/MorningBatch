package package2;

import package1.class1;

public class class3 extends class1{

	public static void main(String[] args) {
		class1 obj = new class1();
		class3 obj1= new class3();
		obj.PublicMethod();
		obj.DefaultMethod();
		obj.ProtectedMethod();
		obj1.ProtectedMethod();
		obj.PrivateMethod();

	}

}
