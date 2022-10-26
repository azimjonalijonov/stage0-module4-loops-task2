package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a =1;
        int k=1;
        while (a<=printToInclusive){
            k=k*a;
            a++;
            System.out.println(k);

        }

    }
}
