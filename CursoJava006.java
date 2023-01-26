public class CursoJava006 {
    public static void main(String[] args){

     /* Array / Vetor em Java */   

    final int tam=5;

    int[] num = new int[tam];
    int[] numeros = {5, 10, 15, 20, 30};
    
    num[0]=10;
    num[1]=20;
    num[2]=30;
    num[3]=40;
    num[4]=50;

    for(int i=0; i<num.length; i++){
        System.out.printf("%d -", num[i]);
    }

    
    System.out.printf("%n%d -", numeros[2]);


    }
}
