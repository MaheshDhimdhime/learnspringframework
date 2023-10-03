package collectionprogramming;

public class ReverseSentence {
	public String reverseWordsInSentence(String sentence) {
		if (sentence==null) {
			return "INVALID";
		}
		if (sentence.equals("")) {
			return "";
		}
		StringBuilder reversedSentence=new StringBuilder();
		
		for(String word:sentence.split(" ")) {
			StringBuilder builderWord=new StringBuilder(word).reverse();
			reversedSentence.append(builderWord).append(" ");
		}
		return reversedSentence.toString().trim();
	}
	public static void main(String[] args) {
		ReverseSentence obj=new ReverseSentence();
		String str=obj.reverseWordsInSentence("This is me");
		System.out.println(str);
	}
}
