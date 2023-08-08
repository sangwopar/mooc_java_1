public class Counter {
	private int startValue;

	public Counter() {
		this(0);
	}
	public Counter(int startValue) {
		this.startValue = startValue;
	}

	public int value() {
		return startValue;
	}

	public void increase() {
		startValue += 1;
	}
	public void increase(int increaseBy) {
		if (increaseBy >= 0) {
			startValue += increaseBy;
		} 
	}

	public void decrease() {
		startValue -= 1;
	}

	public void decrease(int decreaseBy) {
		if (decreaseBy >= 0) {
			startValue -= decreaseBy;
		}
	}
	
}
