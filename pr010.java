class pr010 {
	public static void main (String[] args) {
		int a = 100, b = 0;
		int result;
		char[] chrs = {'A', 'B', 'C'};
		for (int i = 0, i < 2; i++) {
			try {
				if (i == 0)
					result = a/b;
				else
					chrs[6] = 'X';
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Перехвачено: " + e);
			}
		}
		System.out.println("После");
	}
}
