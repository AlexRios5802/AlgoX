package algox;

import java.util.Scanner;

public class AlgoX {

    public static void uno() {
        
    }

    public static void main(String[] args) {

        int asciiValue;
       char cChar;
       String sFrase = "ALEX";
       char [ ] aChar = sFrase.toCharArray( );
        for (int i = 0; i < aChar.length; i++) {
            System.out.println(aChar [i]);
            cChar = aChar [i];
            asciiValue = (int) cChar;
            System.out.println(asciiValue);
            System.out.println(asciiValue-65);
        }
        
    }
}
