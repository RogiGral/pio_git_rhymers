package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	static final int STACK_CAPACITY = 12;
	static final int EMPTY_STACK_VALUE = -1;
	static final int LAST_VALUE = 11;

	private final int[] numbers = new int[STACK_CAPACITY];
	public int total = EMPTY_STACK_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
