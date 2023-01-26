import java.util.Scanner;

public class CursoJava05 {
    /* Tipos de Loops: for, while, do while */
    public static void main(String[] args){

        try (Scanner scan = new Scanner(System.in)) {
            //FOR
            for(int cont=0; cont < 5; cont++){
                System.out.println(cont + " - Contando");
            }
            

            int max=scan.nextInt();
            //WHILE
            int cont=0;
              while(cont < max){
                  System.out.println(cont + " - Contagem");
                  cont++;
            }
        }
 
        //DO WHILE
        int count=0;
        do{
            System.out.println(count + " - Count");
            count++;
        }while(count <= 0);

        System.out.println("Fim do Programa"); 
    }

      









} 
    
 