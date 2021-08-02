package step3.domain;

public class Car {
	private static final int COUNT_ADVANCE = 1;
	private static final int CONDITION_ADVANCE = 4;
	private int position;

	public Car() {
		this.position = 0;
	}

	public void advanceOrStop(int randomNumber) {
		if (randomNumber >= CONDITION_ADVANCE) {
			advance();
		}
	}

	private void advance() {
		this.position += COUNT_ADVANCE;
	}

	public int getPosition() {
		return position;
	}
}
