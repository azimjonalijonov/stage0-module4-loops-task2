package school.mjc.stage0.loops.task2;

public class Multiplication {

    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive==0){
            System.out.println("");
        }else {
        int k=0;
        int a =0;
        while(a<=Math.abs(multiplyByAndToInclusive)){
            System.out.println(a*multiplyByAndToInclusive);
            a++;
        }}
    }
}
