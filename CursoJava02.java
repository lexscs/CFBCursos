public class CursoJava02 {
    public static void main(String[] args){
        //IF IF..ELSE SWITCH

        //Tabela verdade AND &&
        /*
         * V V = V
         * V F = F
         * F V = F
         * F F = F
         */

        //Tabela verdade OR ||
        /*
         * V V = V
         * V F = V
         * F V = v
         * F F = F
        */

        
        int nota = 85;
        int media = 60;
        int faltas = 10;
        int maxFaltas = 5;
        String res;

        //Operação ternária
        res=(nota >= media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);

        
        if((nota >= media) && (faltas <= maxFaltas)){
            System.out.println("Aluno(a) aprovado");
        } else if(nota >= 40) {
            System.out.println("Aluno(a) de recuperação");
        } else {
            System.out.println("Aluno(a) reprovado");
        }
        System.out.println("Fim do programa");

    //Switch ou Caso
    int posicao = 0;

    switch (posicao){
        case 1:
            System.out.println("Primeiro Lugar");
            break;
    
        case 2:
            System.out.println("Segundo Lugar");
            break;

        case 3:
            System.out.println("Terceiro Lugar");
            break;

        case 4: case 5: case 6: 
            System.out.println("Prêmio de participação");    
            break;

        default:
            System.out.println("Não subiu ao pódio");
            break;
    }

    }

}
