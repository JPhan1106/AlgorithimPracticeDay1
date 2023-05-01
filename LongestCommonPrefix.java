package big0Homework;

public class LongestCommonPrefix {
	public static void main(String[] args) {

		String[] array = { "sunny", "sunflower", "sunhouse" };
		System.out.println(findLongestCommonPrefix(array));
		System.out.println("\n");
		System.out.println("BigO: number of strings * number of common prefix characters");

	}

	public static String findLongestCommonPrefix(String[] array) {
		StringBuilder sb = new StringBuilder();
		if (array.length == 0) {
			return "null";
		}
		if (array.length == 1) {
			return array[0];
		} else {

			int minimumLength = array[0].length();
			for (int i = 1; i < array.length; i++) {
				minimumLength = Math.min(minimumLength, array[i].length());
			}

			for (int i = 0; i < minimumLength; i++) {
				for (String string : array) {
					if (string.charAt(i) != array[0].charAt(i)) {
						return sb.toString();
					}
				}
				sb.append(array[0].charAt(i));
			}
		}
		return sb.toString();
	}

}
