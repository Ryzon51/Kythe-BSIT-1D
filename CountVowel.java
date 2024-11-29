public class CountVowel {
	public static void main(String[] args) {
		String text ="Kythe";
		  System.out.print("The number of vowels in" + text + "is" );          
	}
	private static int countVowels(String text) {
	    int count = 0;
	    for (int i = 0; i < text.length( ); i++) {
	      char ch=text.toLowerCase().charAt(i);
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	      count++;
	     
	          System.out.println(ch);
	      }
	    }
	    return count;
	}
}