package tips;

import java.math.BigDecimal;

public class EclipseTipsAndTricks {

	class Test implements Comparable<String> {

		@Override
		public int compareTo(String o) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static void main(String[] args) throws InterruptedException {
		DummyForTest dt = new DummyForTest();
		dt.doSomething();

		BigDecimal bd = new BigDecimal(25);
		Thread.sleep(something());
	}

	private static int something() {
		return 1000 * 45 * 456;
	}

}
