public class CursoJava008 {
    public static void main(String[] args){
        /* Métodos em Java */

        msg("Curso008", 1);
        System.out.println(soma(10,20,5,2,3,20,1));
        System.out.println(soma2(10,20));
                
    }

    // void = não tem um retorno
    // main (argumentos) {o que o método faz, por exemplo System.out.println(printa algo na tela)}
    // int = nesse exemplo vai retornar o valor de um número inteiro
    // double = para valores quebrados, meio valores

    /* exemplo abaixo com uma lista de arrays */
    
    public static int soma(int...numeros){
        int res=0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }

    public static int soma2(int n1, int n2){
        int res=n1+n2;
        return res;
    }
    
    

    public static void msg(String m, int l){
        for(int i = 0; i < l; i++){
            System.out.println(m);
        }
    }

}
