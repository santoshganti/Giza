package edu.game.snakesandladder;

public class StringSorting {
	public static void main(String[] args) {
		String example = "iloveicecreamandmango";
		String example1 = "ilovesamsungmobile";
		StringSorting s = new StringSorting();
		s.wordBreak(example);
		s.wordBreak(example1);

	}

	public boolean dictionaryContains(String word) {
		String dictionary[] = { "mobile", "samsung", "sam", "sung", "man",
				"mango", "icecream", "and", "go", "i", "love", "ice", "cream" };
		int size = dictionary.length / dictionary[0].length();
		for (int i = 0; i < size; i++) {
			if (dictionary[i].equals(word))
				return true;
		}
		return false;
	}

	public void wordBreak(String str) {
		wordBreakUtil(str, str.length(), "");
	}

	public void wordBreakUtil(String str, int size, String result) {
		for (int i = 0; i <= size; i++) {
			String prefix = str.substring(0, i);

			if (dictionaryContains(prefix)) {
				if (i == size) {
					result += prefix;
					System.out.println(result);
				}
				wordBreakUtil(str.substring(i, size - 1), size - i, result
						+ prefix + " ");
			}

		}
	}
}
