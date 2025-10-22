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
	}
}
