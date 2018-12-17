
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ex201VierGewinnt.AbstractSummenStrategy;
import ex201VierGewinnt.SpaltenSumme;
import ex201VierGewinnt.Utility;

public class DemoVierGewinntMain {

    public static void main(String[] args) {
        try {
            Integer[][] data = new Integer[][]{
                {1, 0, 0, 1},
                {1, 0, -1, 0},
                {1, 0, 0, 0},
                {1, 1, 1, 1}
            };
            List<Integer[]> matrix = Arrays.asList(data);
            Utility.showMatrix(matrix);

            //Strategies auswählen und setzen
            List<AbstractSummenStrategy> strategies = new ArrayList<>();
            strategies.add(new SpaltenSumme());
            strategies.add(new ZeilenSumme());

            //Summieren der Zeilenwerte und Spaltenwerte
            for (AbstractSummenStrategy strategy : strategies) {

                //Summen berechnen
                Integer[] collonenSum = strategy.check(matrix);
                System.out.println("Strategy: " + strategy.getName());
                Utility.show(Arrays.asList(collonenSum));

                //Sieger ermitteln
                int winner = 0;
                Integer collone = null;
                for (int i = 0; i < collonenSum.length; i++) {
                    if(collonenSum[i]==4 || collonenSum[4] == -4){
                        collone = i;
                        winner = collonenSum[i]==4?4:(collonenSum[i]==-4?-4:0);
                        break;
                    }
                    
                }
                System.out.println("And the winner is "+winner+" in der Collone"+collone);
            }
        } catch (Exception e) {
            System.err.println("Error-Main: " + e.getMessage());
        }

    }

}
