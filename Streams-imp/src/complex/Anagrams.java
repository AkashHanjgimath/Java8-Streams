package complex;

public class Anagrams {

    public static void main(String[] args) {

        String str1="abc";
        String str2="acb";

        System.out.println("Are given Strings are Anagrams :" + isAnagram(str1,str2));

    }
    public static boolean isAnagram(String str1,String str2){
        if (str1.length()!=str2.length())
        {
            return false;
                    }

      return str1.chars().sorted()
              .mapToObj(x->(char)x).toList()
              .equals(str2.chars()
                      .sorted()
                      .mapToObj(x->(char)x).toList());

    }
}
