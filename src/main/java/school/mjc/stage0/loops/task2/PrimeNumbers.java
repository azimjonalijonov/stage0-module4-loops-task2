package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        int k =0;
        for (int i = 2; i <=printToInclusive ; i++) {
            for (int  j =1;j<i;j++){
                if (i%j==0){
                 k++;
                }
            }
            if (k==1){
                System.out.println(i);
            }
            k=0;

        }
    }
}
