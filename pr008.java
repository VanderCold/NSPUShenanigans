class UseFinally {
	public static void genExc(int what) {
		int t;
		int[] nums = new int[2];
		System.out.println("Получили: " + what);

		try {
			switch (what) {
				case 0:
					t = 10/what;
					break;
				case 1:
					nums[4] = 10;
					break;
				case 2: 
					return;
			}
		}
		catch (ArithmeticException exc) {
			System.out.println("Неправильно");
			return;
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Вне границ");
		}
		finally {
			System.out.println("Выходим");
		}
	}
}

class pr008 {
	public static void main(String args[]) {
		for (int i = 0; i<3; i++) {
			UseFinally.genExc(i);
		}
	}
}
