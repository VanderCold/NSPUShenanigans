class GenQueueDemo {
	public static void main(String args[]) {
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> iQ = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("iQ операции");
		try {
			for (int i = 0; i < 6; i+) {
				System.out.println("Добавляем " +i+ " в очередь");
				iQ.put(i);
			}
		}
		catch(QueueFallException exc) {
			System.out.println(exc);
		}

		System.out.println();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Убираем из очереди");
				iVal = iQ.get();
				System.out.println(iVal);
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}

		String[] sArray = new String[10];
		GenQueue<String> sQ = new GenQueue<String>(sArray);
		String sVal;
		System.out.println("Строковые операции");

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Добавляем " +i+ " в очередь");
				sQ.put("Строка " + i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}

		System.out.println();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Убираем строку");
				sVal = sQ.get();
				System.out.println(sVal);
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}

		GenCircleQueue<Integer> iCQ = new GenCircleQueue<Integer>(iArray);
		System.out.println("iCQ операции");
		try {
			for (int i = 0; i < 6; i+) {
				System.out.println("Добавляем " +i+ " в очередь");
				iCQ.put(i);
			}
		}
		catch(QueueFallException exc) {
			System.out.println(exc);
		}

		System.out.println();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Убираем из очереди");
				iVal = iCQ.get();
				System.out.println(iVal);
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}


		try {
			for (int i = 0; i < 6; i+) {
				System.out.println("Добавляем заново " +i+ " в очередь");
				iCQ.put(i);
			}
		}
		catch(QueueFallException exc) {
			System.out.println(exc);
		}
	}
}
