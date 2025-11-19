class GenDyQueue<T> implements IGenQ<T> {
	private int putloc, getloc;
	private T[] q;
	public GenDynQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	public void put(T obj) throws QueueFullException {
		if (putloc == q.length) {
			//T[] t = new T[q.length * 2];
			for (int i=0; i < q.length; i++)
				t[i] = q[i];
			q = t;
		}
		q[pucloc++] = element;
	}
	public T get() throws QueueEmptyException {
		if (getloc == getloc)
			throw new QueueEmptyException();
		return q[getloc++];
	}
}
