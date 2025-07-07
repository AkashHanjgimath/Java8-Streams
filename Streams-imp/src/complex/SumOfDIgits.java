package complex;

public class SumOfDIgits {

    public static void main(String[] args) {

        int num=12345;

        int sum=0;

       int result= String.valueOf(num)
                .chars()
                .peek(ch->System.out.println("Chars value : "+ch))  //peek are used to debug the streams
                .map(Character::getNumericValue)
                .peek(ch-> System.out.println("getNumericValue : "+ch))
                .sum();

        System.out.println("Total sum is : "+result);

    }
}
