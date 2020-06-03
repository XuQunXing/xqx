package programOJ;

import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character> vowel=new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        Set<Character> consonant=new HashSet<>();
        for (int i = 0; i < 26; i++) {
            consonant.add((char)('A'+i));
        }
        consonant.remove('A');
        consonant.remove('E');
        consonant.remove('I');
        consonant.remove('O');
        consonant.remove('U');
        while (sc.hasNext()) {
            String str=sc.nextLine();
            char[] chars=str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char ch=chars[i];
                if (vowel.contains(ch)) {
                    chars[i]=Character.toUpperCase(ch);
                }
                if (consonant.contains(ch)) {
                    chars[i]=Character.toLowerCase(ch);
                }
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
