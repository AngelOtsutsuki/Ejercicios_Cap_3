import java.util.Random;

public class Ejer3_1 {    
    public static void main(String[] args){

        int a = 12;
        int b = 5;
        int n = 100;
        int cur = 92;
        int next = 0;

        for(int o = 0; o < 5; o++){

            next = (a * cur + b) % n;

            System.out.println((o+1)+".- "+next);
            cur = next;
        }
    }
}