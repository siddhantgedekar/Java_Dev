// count lower case vowels in a string

public class CountVowel {
    public static void main(String [] args) {

        String a = "My name is Anthony Gonzalwes, mein duniya mein akela hu. Dil bhi hai khali ghar bhi hai khali, isme rahegi koi qismat wali.";
        int count = 0;
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'i') {
                count++;
            }
        }
        System.out.println("Count of lower case vowel is: " + count);
    }
}