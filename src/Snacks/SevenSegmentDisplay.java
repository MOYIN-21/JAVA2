package Snacks;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        SevenSegment("11100001");
    }


    public static void SevenSegment(String display) {
        char var = display.charAt(0);
        char var2 = display.charAt(1);
        char var3 = display.charAt(2);
        char var4 = display.charAt(3);
        char var5 = display.charAt(4);
        char var6 = display.charAt(5);
        char var7 = display.charAt(6);
        char var8 = display.charAt(7);
        char[] varyArray = {var, var2, var3, var4, var5, var6, var7, var8};
        String[][] segment = new String[][]{
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}};
        for (int row = 0; row < segment.length; row++) {
            for (int column = 0; column < segment[row].length; column++) {
                if (display.charAt(7) == '1') {
                    if (display.charAt(0) == '0') {
                        segment[0][1] = " ";
                        segment[0][2] = " ";
                    }
                    if (display.charAt(1) == '0') {
                        segment[1][3] = " ";
                    }
                    if (display.charAt(2) == '0') {
                        segment[3][3] = " ";
                    }
                    if (display.charAt(3) == '0') {
                        segment[4][0] = " ";
                        segment[4][1] = " ";
                        segment[4][2] = " ";
                    }
                    if (display.charAt(4) == '0') {
                        segment[3][0] = " ";
                    }
                    if (display.charAt(5) == '0') {
                        segment[1][0] = " ";
                    }
                    if (display.charAt(6) == '0') {
                        segment[2][0] = " ";
                        segment[2][1] = " ";
                        segment[2][2] = " ";
                    }
                    System.out.print(segment[row][column] + ' ');
                }
                System.out.println();
            }
        }
    }
}


