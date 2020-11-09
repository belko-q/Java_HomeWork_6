package academy.belhard;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String str1 = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 26; i++) {
            Random r = new Random();
            int result = r.nextInt(str1.length());
            char s0 = str1.charAt(result);
            System.out.print(s0);

        }
        System.out.println();

    }



}
