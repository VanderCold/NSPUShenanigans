class pr005 {
	public static void main(String args[]) {
		int number[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};

		try {
			System.out.println("До");
			throw new ArithmeticException();
		}
		catch (ArithmeticException exc) {
			System.out.println("Перехват ArithmeticException");
		}
		System.out.println("После");
	}
}
