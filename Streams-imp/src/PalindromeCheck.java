import java.util.stream.IntStream;

public class PalindromeCheck {

    public static void main(String[] args) {
        String name="madam";

      boolean isPlaindrome= IntStream.range(0,name.length())
                 .allMatch(i->name.charAt(i)==name.charAt(name.length()-1-i));

        System.out.println(isPlaindrome);

        //allMatch()-It checks if character at position i is equal to the character at the mirror position from the end
    }
}
