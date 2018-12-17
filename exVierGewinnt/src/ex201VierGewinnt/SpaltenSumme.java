package ex201VierGewinnt;

import java.util.List;

public class SpaltenSumme extends AbstractSummenStrategy {

    public SpaltenSumme() {
        super("Spaltensumme");
    }

    @Override
    public Integer[] check(List<Integer[]> matrix) {
        Integer[] spaltenSum = new Integer[matrix.size()];

        for (Integer[] zeile : matrix) {
            for (int s = 0; s < zeile.length; s++) {
                if(spaltenSum[s]==null){
                    spaltenSum[s]=new Integer(0);
                }
                spaltenSum[s]+=zeile[s];
            }
        }
        return spaltenSum;
    }

}
