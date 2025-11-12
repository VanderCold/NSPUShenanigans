class Rethrow {
	public static void genExc() {
		int number[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};

		for (int i=0; i < number.length; i++) {
			try {
				System.out.println(number[i] + " / " + denom[i] + " = " = number[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				System.out.println("Недопуст. операция");
			}	
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Выход за границы массива");
				throw exc;
			}
		}
	}
}

class pr006 {
	public static void main(String args[]) {
		try { 
			Rethrow.genExc();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("За границы");
			System.out.println("Выходим");
		}
		System.out.println("Вне цикла");
	}
}
