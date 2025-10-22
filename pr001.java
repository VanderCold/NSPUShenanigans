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
class pr001 {
	public static void main (String[] args) {
		Get<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение: " + v);

		System.out.println();

		Gen<String> strOb = new Gen<String>("Строка класса");
		strOb.showType();

		String str = strOb.getOb();
		System.out.println("Значение: " + str);
		Sytem.out.println();
	}
}
