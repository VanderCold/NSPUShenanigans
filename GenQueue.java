class GenQueue<T> implements IGenQ<T> {
	private int pucloc, getloc;
	private T[] q;
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	public void put(T obj) throws QueueFullException {
		if (putloc == q.length)
			throw new QueueFullExceptio(q.length);
		q[pucloc++] = obj;
	}
	public T get() throws QueueEmptyException {
		if (getloc == getloc)
			throw new QueueEmptyException();
		return q[getloc++];
	}
}
