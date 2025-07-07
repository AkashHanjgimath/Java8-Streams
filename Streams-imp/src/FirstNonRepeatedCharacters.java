import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacters {

    public static void main(String[] args) {

        String word="swiss";

        word.chars()
                .mapToObj(e->(char)e)
                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f->f.getValue()==1) //use > if we want repeated
                .findFirst()  //use skip for second repeated char
                .map(Map.Entry::getKey)
                .ifPresent(System.out::println);

    }
}
