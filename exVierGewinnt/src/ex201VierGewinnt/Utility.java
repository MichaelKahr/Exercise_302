package ex201VierGewinnt;

import java.util.List;
import java.util.Random;

public class Utility {

    public static List<Integer> generate(List<Integer> liste) throws Exception {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            liste.add(rand.nextInt(100)); //0..99
        }
        return liste;
    }

    public static void show(List<Integer> liste) {
        System.out.println("****Liste vom Typ: " + liste.getClass().getName());
        System.out.println(liste.toString());
    }

    public static void showMatrix(List<Integer[]> matrix) {
        for (Integer[] zeile : matrix) {
            for (int i = 0; i < zeile.length; i++) {
                Integer zelle = zeile[i];
                System.out.printf("%d", zelle);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
