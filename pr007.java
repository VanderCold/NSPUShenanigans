class ExcTest {
	static vod genException() {
		int nums[] = new int[4];
		System.out.println("До");
		nums[4] = 10;
		System.out.println("После");
	}
	static void genException2() {
		int nums[] = {4, 8, 16, 32, 64, 128, 256};
		int denominator[] = {2, 4, 4, 8, 4};
		for (int i = 0; i < nums.length; i++) {
			System.out.println("До");
			System.out.println(nums[i] + " / " + denominator[i] + " = " + nums[i]/denominator[i]);
			System.out.println("После");
		}
	}
}

class pr007 {
	public static void main (String args[]) {
		int nums[] = new int[4];
		try {
			ExcTest.genException2();
			ExcTest.genException();
		}
		catch(arrayIndexOutOfBoundsException exc) {
			System.out.println("Вне границ");
			System.out.println(exc);
			System.out.println("\nСмотрим Стак Трейс: ");
			exc.printStackTrace();

			System.out.println("Инфо.");
			System.out.println(exc.toString());
	
		}
		catch(Throwable exc) {
			System.out.println("Исключение: " + exc);
			System.out.println("\nСмотрим Стак Трейс: ");
			exc.printStackTrace();

			System.out.println("Инфо.");
			System.out.println(exc.toString());
		}
		System.out.println("После");
	}
}
