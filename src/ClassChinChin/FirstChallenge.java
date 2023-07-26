package ClassChinChin;

public class FirstChallenge {
    public static void main(String[] args) {
    for(int counter = 1; counter<=10; counter ++)
        System.out.print(counter + ", \t");
    for(int mind = 2; mind<=10; mind+=2)
        System.out.print(mind + ", \t");
    for(int mind = 1; mind<=10; mind+=2)
        System.out.print(mind + ",\t ");
    for(int mind = 4; mind<=10; mind+=4)
        for (int mind2 = 1; mind2 <= 5; mind2++)
            System.out.print(mind + ", \t ");
    for(int mind = 4; mind<=10; mind+=4)
        for(int mind3 = 1; mind3<=1; mind3++)
            System.out.print(mind + ",\t");
    int mind2 = 1;
    for (int mind = 1; mind <= 5; mind++) System.out.print((mind2 *= 4) + ", \t ");
    int mind4 = 1;
        for (int mind = 1; mind <= 5; mind++) System.out.print((mind4 *= 8) + ", \t ");
        int mind5 = 1, total = 0;
        for (int mind = 1; mind <= 5; mind++) {
            mind5 = mind5* 4;
            total = total + mind5;
            System.out.println(total);
        }
        System.out.println(mind5);
    }
}

