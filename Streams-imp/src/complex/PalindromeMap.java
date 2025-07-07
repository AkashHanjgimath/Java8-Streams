package complex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//converting list string into map and where each string is key boolean as a value ,
// then we need to indicate it as palindrome

public class PalindromeMap {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("level","madam","apple","orange","malayalam");

       Map<String,Boolean> ispalindrome= words.stream().collect(Collectors.toMap(
                str->str,
                str->str.equals(new StringBuilder(str).reverse().toString())
        ));

        System.out.println("Palindrome map is "+ ispalindrome);

        // map with key as the First character and value as list of string starting with characters

        List<String> word=Arrays.asList("level","apple","apricot","banana","blueberry","madam");

       Map<Character,List<String>>result= word.stream().collect(Collectors.groupingBy(x->x.charAt(0)));

        System.out.println(result);


    }
}
