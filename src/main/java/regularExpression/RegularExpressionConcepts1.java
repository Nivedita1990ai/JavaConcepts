package regularExpression;

public class RegularExpressionConcepts1 {

	public static void main(String[] args) {
		//Challenge 1
		String str = "I want a bike.";
		System.out.println(str.matches("[A-Z][ ][a-z]{4}[ ][a-z][ ][a-z]{4}['.']"));
	}
}
