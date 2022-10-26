package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power<0){
            System.out.println("too much power");
        }else
        {
            int q =0;
            while (q<=power){
                System.out.println(Math.pow(2,q));
                q++;
            }
        }

    }
}
