interface Containment<T> {
	boolean contains(T o);
}

class NumFns<T extends Number> {
	T num;
	NumFns (T n) {
		num = n;
	}

	double inverse() {
		return 1/num.doubleValue();
	}

	int whole() {
		return num.intValue();
	}
	double dr() {
		return num.doubleValue() - num.intValue();
	}
	boolean absEqual (NumFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}

	class A<T, V extends T> {
		T first;
		V second;

		A(T a, V b) {
			first = a;
			second = b;
		}
	}



class B {
}
class B_A extends B {
}
class B_B extends B {
}
class B_C extends B {
}
class BA {
}
class Gen1<T> {
	T ob;

	Gen1(T o) {
		ob = o;
	}
}
class Test {
	static void test(Gen1<? extends B> o) {
	}
	static void test2(Gen1<? super B_A> 0) {
	}
}
class GenMeth {
	static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] y) {
		if(x.length != y.length)
			return false;

		for(int i=0; i < x.length; i++)
			if(!x[i].equals(y[i]))
				return false;
		return true;
	}
}

class Summation {
	private int sum;
	<T extends Number> Summation(T arg) {
		sum = 0;

		for(int i=0; i<= arg.intValue(); i++)
			sum += i;
	}
	int getSum() {
		return sum;
	}
}

class ClassGenInt<T> implements Containment<T> {
	T[] arrayRef;
	ClassGenInt(T[] o) {
		arrayRef = o;
	}

	public boolean containts(T o) {
		for (T x:arrayRef)
			if (x.equals(o)) return true;
		return false;
	}
}

class pr002 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная величина iOb: " + iOb.inverse());

		System.out.println("Цел. часть iOb: " + iOb.whole());

		System.out.println("Дроб. часть iOb: " + iOb.dr());

		NumFns<Double> dOb = new NumFns<Double>(10.14);

                System.out.println("Обратная величина dOb: " + dOb.inverse());

                System.out.println("Цел. часть dOb: " + dOb.whole());

                System.out.println("Дроб. часть dOb: " + dOb.dr());
		
		A<Integer, Integer> x = new A<Integer, Integer>(1,2);
		A<Integer, Integer> y = new A<Integer, Integer>(1.1,2);

		NumFns<Integer> intOb = new NumFns<Integer>(6);
		NumFns<Double> doubleOb = new NumFns<Double>(-6, 0);
		NumFns<Long> longOb = new NumFns<Long>(5L);

		System.out.println();
		System.out.println("Сравнение intOb и doubleOb");
		if(intOb.absEqual(doubleOb))
			System.out.println("Совпадают");
		else
			System.out.println("Не совпадают");
		
		System.out.println("Сравнение intOb и longOb");
		if(intOb.absEqual(longOb))
			System.out.println("Совпадают");
		else
			System.out.println("Не совпадают");

		B b1 = new B();
		B_A b2 = new B_A();
		B_B b3 = new B_B();
		B_C b4 = new B_C();
		BA ba1 = new BA();
		
		Gen1<B> w1 = new Gen1<B>(b1);

		Gen1<B_A> v2 = new Gen1<B_A>(b2);
		Gen1<B_B> v3 = new Gen1<B_B>(b3);
		Gen1<B_C> v4 = new Gen1<B_C>(b4);
		Gen1<BA> v5 = new Gen1<BA>(ba1);

		Test.test(w1);
		Test.test(v2);
		Test.test(v3);
		Test.test(v4);
		//Test.test(v5);
		
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3, 4, 5}};
		Integer nums3[] = {1, 2, 7, 4, 5};
		Integer nums4[] = {1, 2, 7, 4, 5, 6};

		System.out.println("Вызов обобщенного метода сравнения");
		if(GenMeth.arraysEqual(nums, nums))
			System.out.println("nums совп.");
		if(GenMeth.arraysEqual(nums, nums2))
			System.out.println("nums и nums2 совп.");
                if(GenMeth.arraysEqual(nums, nums3))
			System.out.println("nums и nums3 совп.");
                if(GenMeth.arraysEqual(nums, nums4))
			System.out.println("nums и nums4 совп.");

		String st1[] = {"Первая", "Вторая"};
		String st2[] = {"Первая", "Вторая"};
		String st3[] = {"Первая", "Втоооорая"};	
		if(GenMeth.arraysEqual(st1, st2))
			System.out.println("st1 и st2 совп.");
		if(GenMeth.arraysEqual(st1, st3))
			System.out.println("st1 и st3 совп.");

		Number nums5[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		Number nums6[] = {1.1, 2.1, 3.1, 4.1, 5.1};
		if(GenMeth.arraysEqual(nums5, nums))
			System.out.println("nums5 и nums совп.");
		if(GenMeth.arraysEqual(nums5, nums))
			System.out.println("nums6 и nums совп.");
	

		System.out.println();
		Summation ob = new Summation(4.2);
		System.out.println("Сумма чисел от 0 до 4 - " + ob.getSum());

		System.out.println();
		Summation ob2 = new Summation(4);
		System.out.println("Сумма чисел от 0 до 4 = " + ob2.getSum());

		System.out.println();
		Integer x10[] = {1,2,3};
		Double y10[] = {1.0, 2.0, 3.0};

		ClassGenInt<Integer> ob3 = new ClassGenInt<Integer>(x10);
		if (ob3.contains(2))
			System.out.println("2 содержится в ob3");
		else
			System.out.println("2 не в ob3");
		if (ob3.contains(4))
	                System.out.println("4 содержится в ob3");
                else
			System.out.println("4 не в ob3");

		ClassGenInt<Double> ob4 = new ClassGenInt<Double>(y10);

		if (ob4.contains(2.0))
			System.out.println("2.0 содержится в ob4");
		else
			System.out.println("2.0 не в ob4");
		if (ob4.contains(4.0))
			System.out.println("4.0 содержится в ob4");
		else
			System.out.println("4.0 не в ob4");
	}
}
