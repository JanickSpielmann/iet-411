package ch.gibb.rekursion;

public class Sentence
{
    private String text;
    /**
     Constructs a sentence.
     @param aText the stripped sentence
     */
    public Sentence(String aText)
    {
        text = aText;
    }
    /**
     Tests for a palindrome.
     @return true if is a palindrome
     */
    public boolean isPalindrome()
    {

        int length = text.length();
        if(length <= 0){
            return true;
        }
        char first = text.toLowerCase().toCharArray()[0];
        char last = text.toLowerCase().toCharArray()[length-1];

        return false;
    }
}
