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
            System.out.println(" ");
            System.out.println(aChar [i]);
            cChar = aChar [i];
            asciiValue = (int) cChar;
            
        String aCodigo [ ] [ ] = new String [26] [1];
        aCodigo[0][0] = ".-";
        aCodigo[1][0] = "-...";
        aCodigo[2][0] = "-.-.";
        aCodigo[3][0] = "-..";
        aCodigo[4][0] = ".";
        aCodigo[5][0] = "..-.";
        aCodigo[6][0] = "--.";
        aCodigo[7][0] = "...";
        aCodigo[8][0] = "..";
        aCodigo[9][0] = ".---";
        aCodigo[10][0] = "-.-";
        aCodigo[11][0] = ".-..";
        aCodigo[12][0] = "--";
        aCodigo[13][0] = "-.";
        aCodigo[14][0] = "---";
        aCodigo[15][0] = ".--.";
        aCodigo[16][0] = "--.-";
        aCodigo[17][0] = ".-.";
        aCodigo[18][0] = "...";
        aCodigo[19][0] = "-";
        aCodigo[20][0] = "..-";
        aCodigo[21][0] = "...-";
        aCodigo[22][0] = ".--";
        aCodigo[23][0] = "-..-";
        aCodigo[24][0] = "-.--";
        aCodigo[25][0] = "--..";
        
            for (int j = 0; j < asciiValue-65; j++) {
                
            }
            
            System.out.println(aCodigo[asciiValue-65] [0]);
        }
        
        
    }
}
