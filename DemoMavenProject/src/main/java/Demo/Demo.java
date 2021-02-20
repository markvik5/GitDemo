package Demo;

import java.util.stream.Stream;

public class Demo {
	static long repeatedString(String s, long n) {
		long a = 0l;
		String b = s;
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (i < s.length()) {
				if (s.charAt(0) == s.charAt(i)) {
					a++;
				}
			} else {
				b = b + s.charAt(c);
				c++;
				if (c == s.length()) {
					c = 0;
				}
				if (s.charAt(0) == b.charAt(i)) {
					a++;
				}
			}
		}

		return a;
	}

	public static void main(String[] args) {
		String s = "aba";
		System.out.println(repeatedString(s, 10));
		System.out.println("HEllo");
		System.out.println("Hi how are you");
	}
}
