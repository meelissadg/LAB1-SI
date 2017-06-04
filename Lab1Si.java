package labSi;

public class Lab1Si {

	public static int maximo(int[] array) {
		int max = array[0];

		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}

		return max;
	}
	
	
	public static int minimo(int[] array) {
		int max = array[0];

		for (int i : array) {
			if (i < max) {
				max = i;
			}
		}

		return max;
	}

	
}
