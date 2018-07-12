package behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {

	private T[] array;
	private int position = 0;

	public ArrayIterator(T[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {

		if (position <= array.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {

		if (hasNext()) {
			T item = array[position++];
			return item;
		}
		throw new NoSuchElementException();
	}

}
