import java.util.Random;

public class inspection2 {
    /* Without changing the code what is the length of a, and what is the value of i?
     */
    public static void main(String[] args){

        Random rand = new Random(11);
        int[] a = new int[len(rand)];
        System.out.print(a);

    }

    private static int len(Random rand){
        int i = rand.nextInt(10000) + 5;
        i++;
        return rand.nextInt(i);
    }
}
