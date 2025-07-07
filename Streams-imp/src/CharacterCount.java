import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

    public static void main(String[] args) {
        String str="hello world";

     Map<String,Long> map= Arrays.stream(str.split(""))
                .filter(f->!f.isBlank())
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));

       map.forEach ((x,y)-> System.out.println("Character: "+x+" Count: "+y));

    }
}
