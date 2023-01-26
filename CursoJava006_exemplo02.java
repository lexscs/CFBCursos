
import java.util.Arrays;


public class CursoJava006_exemplo02 {
    public static void main(String[] args){
        
        final int tam=10;
        int[] num={9,2,5,4,7,0,1,2,3,6};
        int[] numeros=new int[tam];

        /* ordena o conteúdo do array */
        //Arrays.sort(num);

        /* preenche um array com um número indicado */
        //Arrays.fill(numeros, 10);

        /* copia de um array para outro sendo sua sintaxe: source/origem, sourcePos/qual posição, dest/destino, destPos/qual posição no destino, length/tamanho ou quantidade */
        //System.arraycopy(num, 0, numeros, 0, tam);

        /* compara 2 arrays, retornando um valor booleano */  
        System.out.printf("Os arrays são iguais: %s", Arrays.equals(num, numeros) ? "Sim" : "Não");

        /* binarySearch procura dentro de uma array uma condição imposta, trazendo resultado boolean, sendo que o array tem que ser ordenado  */

        /* nesse for a variável n está lendo todo array declarado acima(num) */
        for(int n:numeros){
            System.out.printf("%d - ", n);
        }


    }
}
