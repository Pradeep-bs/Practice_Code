package org.CodingChallengeByPradeep;

public class ReversingAString {

	public static void main(String[] args) {
		String str="Damn reverse this one";
		System.out.println(ReverseTheString(str));

	}

	private static String ReverseTheString(String str) {
		return new StringBuilder(str)
				.reverse()
				.toString();
		
	}

}
