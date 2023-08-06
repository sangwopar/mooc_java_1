public class Timer {
	private ClockHand seconds;
	private ClockHand ofSeconds;

	public Timer() {
		this.seconds = new ClockHand(60);
		this.ofSeconds = new ClockHand(100);
	}

	public void advance() {
		this.ofSeconds.advance();

		if (this.ofSeconds.value() == 0) {
			this.seconds.advance();
		}
	}

	public String toString() {
		return seconds + ":" + ofSeconds;
	}
	
	
}
