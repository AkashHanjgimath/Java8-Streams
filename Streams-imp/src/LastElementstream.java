import java.util.Arrays;

public class LastElementstream {

    public static void main(String[] args) {
        int[] arr={10,2,15,40,60};

        Arrays.stream(arr).skip(arr.length-1).findFirst().ifPresent(System.out::println);

    }

}
