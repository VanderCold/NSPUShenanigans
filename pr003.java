class ExcTest {
	static void genException() {
		int nums[] = new int[4];
		System.out.println("До искл. ситуации");
		nums[8] = 10;
		System.out.println("Строка после искл. ситуации");
	}
}

class pr003 {
	public static void main(String args[]) {
		int nums[] = new int[4];

		int number[] = {4, 8, 16, 32, 64, 128, 256, 512}
		int denom[] = {2, 0, 4, 4, 0, 8}
		for (int i = 0; i < number.length; i++) {
			try {
				//System.out.println("До искл. ситуации");
				//nums[8] = 10;
				//System.out.println("Строка после искл. ситуации");
				System.out.println(number[i] + " / " + denom[i] + " = " + number[i]/denom[i]);
				//ExcTest.getException();
			}

			catch(ArrayIndextOutOfBoundsException exc) {
				System.out.println("Искл. ситуация: за границами массива");
			}
			//catch(ArithmeticException exc2) {
			//	System.out.println("Искл. ситуация: неверная операция");
			//}
			//System.out.println("После catch");
		//}
			catch (Throwable exc) {
				System.out.println("Исключение без обработчика");
			}
		}
	}
}
