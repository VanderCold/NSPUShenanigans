class Gen<T> {
	T ob;
	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}

	void shotType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}
}
class TwoGen<T,V> {
	T ob1;
	V ob2;
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	T getOb1() {
		return ob1;
	}

        V getOb2() {
                return ob2;
	}
	
        void showTypes() {
		System.out.println("Тип T: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	}
}

class pr001 {
	public static void main (String[] args) {
		Gen<String> strOb = new Gen<String>("Один обобщ. тип");
		String str = strOb.getOb();
		System.out.println("Значение обобщ. типа с 1 парам. " + str);

		TwoGen<Integer, String> tgOb;
		
		tgOb = new TwoGen<Integer, String>(88, "Обощения");
		tgOb.showTypes();
		int v = tgOb.getOb1();
		System.out.println("Значение: " + v);

		System.out.println();

		str = tgOb.getOb2();
		System.out.println("Значение: " + str);
	}
}
