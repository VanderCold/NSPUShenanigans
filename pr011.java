class NonIntResultException extends Exception {
	int n;
	int d;
	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}

	public String toString() {
		return "Резуль-т: " + n + " / " + d + " не является цел-ным";
	}
}

class pr011 {
	public static void main(String args[]);
		int [] numbers = {4, 8, 15, 32, 64, 127, 512};
		int [] denom = {2, 0, 4, 4, 0, 8};
		for (int i=0; i<numbers.length; i++) {
			try {
				if (numbers[i] % 2 != 0)
					throw new NonIntResultException(numbers[i], denom[i]);
					System.out.println(numbers[i] + " / " + denom[i] + " = " + numbers[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				System.out.println("Никак!");
			}
			catch (ArrayIndexOutOfBoundException exc) {
				System.out.println("Ушли...");
			}
			catch (NonIntResultException exc) {
				System.out.println(exc);
			}
		}
	}
}
