package kata;

public class FizzBuzzer {

	private static final int BUZZ_FACTOR = 5;
	private static final int FIZZ_FACTOR = 3;

	public String fizzBuzz(int input) {
		if (input % (FIZZ_FACTOR * BUZZ_FACTOR) == 0)
			return "fizzbuzz";
		if (input % BUZZ_FACTOR == 0)
			return "buzz";
		if (input % FIZZ_FACTOR == 0)
			return "fizz";
		return String.format("%d", input);
	}

}
