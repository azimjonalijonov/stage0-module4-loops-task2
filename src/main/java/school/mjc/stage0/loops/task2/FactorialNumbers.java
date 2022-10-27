package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive==0){
            System.out.println(1);
        }else {
        int a =1;
        int t=0;
        int k=1;
        while (a<=printToInclusive){
            if (t==0){
                System.out.println(1);
                t++;
            }
            k=k*a;
            a++;
            System.out.println(k);

        }}

    }
}
