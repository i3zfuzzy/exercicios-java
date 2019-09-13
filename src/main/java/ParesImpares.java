import java.util.ArrayList;
import java.util.List;

public class ParesImpares {

    void paresImpares() {
        List<Integer> imp = new ArrayList();
        List<Integer> par = new ArrayList();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0) {
                imp.add(i);
            } else {
                par.add(i);
            }

        }
        int somaImp = 0;
        for (int i = 0; i <= imp.size() - 1; i++) {
            somaImp += imp.get(i);
        }
        long multPar = 1;
        for (int i = 1; i <= par.size() - 1; i++) {
            multPar *= par.get(i);
        }
        System.out.println(multPar);
        System.out.println(somaImp);
        System.out.println(imp);
        System.out.println(par);
    }

}
