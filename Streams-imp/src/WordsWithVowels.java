import java.util.Arrays;

public class WordsWithVowels {

    public static void main(String[] args) {
        String sentence= "I Have too many Orange in my basket";
        int k=2;

        Arrays.stream(sentence.split(" "))
                .filter(f->countVowels(f)==k)
                .forEach(System.out::println);



    }
    public static long countVowels(String word)
    {
        return word.chars()
                .filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
                .count();
    }

}
