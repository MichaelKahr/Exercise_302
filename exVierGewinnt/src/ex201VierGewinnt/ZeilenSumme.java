import ex201VierGewinnt.AbstractSummenStrategy;
import java.util.List;

public class ZeilenSumme extends AbstractSummenStrategy {

    public ZeilenSumme() {
        super("Zeilensumme");
    }

    @Override
    public Integer[] check(List<Integer[]> matrix) {
        Integer[] zeilenSum = new Integer[matrix.size()];
        int z = 0;
        for (Integer[] zeile : matrix) {
            for (int s = 0; s < zeile.length; s++) {
                if(zeilenSum[s]==null){
                    zeilenSum[s]=new Integer(0);
                }
                zeilenSum[z]+=zeile[s];
            }
            z++;
        }
        return zeilenSum;
    }

}