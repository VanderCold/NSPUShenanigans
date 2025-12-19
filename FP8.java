interface MyFunc {
	MyClass func(String s);
}
class MyClass {
	private String str;
	MyClass(String s) {
		str = s;
	}
	
	MyClass() {
		str = "";
	}
	
	String getStr() {
		return str;
	}
}

MyFunc myClassCons = MyClass::new;

MyClass mc = myClassCons.func("Строка");

MyClass mc2 = myClassCons.func();

interface MyFunc2 {
	MyClass func();
}

MyFunc2 myClassCons2 = MyClass::new;

MyClass mc2 = myClassCons2.func();

interface MyClassArrayCreator {
	MyClass[] func(int n);
}

MyClassArrayCreator mcArrayCons = MyClass[]::new;

MyClass[] a = mcArrayCons.func(3);
UnaryOperator<Integer> uO = (n) -> n+1;
UnaryOperator<Integer> uO = (s) -> s + " " + s;

uO.apply("Строка-тест");

BinaryOperator<Integer> bO = (n, m) -> n/m;
BinaryOperator<String> bO = (s1, s2) -> s1 + s2;
bO.apply("Строка 1", "Строка2 ");

Consumer<Integer> cons = (n) -> {
	n + n+5;
}

Supplier<Double> suppl = () -> 78.5

static double test(int a, int b) {
	return double()a/b;
}

static double test(int a, int b) {
	return (double)a/b;
}

Supplier<Double> suppl = () -> test(10, 3);

Function<String, Integer> func = (str) -> str.length();

Predicate<Integer> pred = (n) -> n<5;