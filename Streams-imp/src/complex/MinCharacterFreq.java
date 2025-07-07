package complex;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinCharacterFreq {

    public static void main(String[] args) {

        String input="banana applles";

        String processed=input.replaceAll(" ","");

        Map<Character,Long> charFreqMap=processed.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       Optional<Map.Entry<Character,Long>>minFreq= charFreqMap.entrySet()
                                                              .stream()
                                                              .min(Map.Entry.comparingByValue());


       if (minFreq.isPresent())
       {
           System.out.println("Character with min Freq is "+minFreq.get().getKey());
           System.out.println("Its frequency is "+minFreq.get().getValue());
       }
       else {
           System.out.println("No character found with min frequency");
       }



    }
}
