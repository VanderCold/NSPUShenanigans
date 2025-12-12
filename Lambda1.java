class MyClass {
	static int myMeth() {
		return 100;
	}
}

interface MyInterface {
	int MyMeth();
	String MyMeth2();
}

class MyClass1 implements MyInterface {
	public int MyMeth() {
		return 100;
	}
	public String MyMeth2() {
		//...
	}
}

interface MyFInterface {
	int MyMeth();
}

MyFuncInterface var1 = () -> 100;
System.out.println("Вызов лямбда v1: " + var1.MyMeth());
System.out.println("Вызов лямбда v2: " + var2.MyMeth());

interface FuncInterface2 {
	double MyMeth(int n);
}

FuncInterface2 reciprocal = (n)->1/n;
System.out.println("Резуль-т вызова FuncInterface2: " + reciprocal.MyMeth(10)); 
