public class Ejer3_2{
    public static void main(String[] args) {
        int i=0, cantidad=15, rango=100;
        int arreglo[] = new int[cantidad];

        arreglo[i]=(int)(Math.random()*rango);
        for (i=1; i<cantidad; i++){
            arreglo[i]=(int)(Math.random()*rango);
            for(int j=0; j<i; j++){
                if(arreglo[i]==arreglo[j]){
                    i--;
                }
            }
        }
        for(int k=0; k<cantidad; k++){
            System.out.print((k+1)+".-"+arreglo[k]+"\n");
        }
    }
}