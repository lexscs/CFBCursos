public class Jogador {
    /* por convenção em JAVA as classes(nome do arquivo) é iniciado em maiúsculo */

    private final int maxVidas = 3;
    private int num = 0;
    private int vidas = 0;
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int pontosJogadores = 0;

    public Jogador(int num){
        this.num = num;
        this.vidas = 3;
        System.out.printf("Jogador criado %d com Sucesso!%n",num);
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    static void pontos(){
        pontosJogadores+=10;
    }

    public void info(){
        System.out.printf("%nJogador: %d", this.num);
        System.out.printf("%nVidas: %d", this.vidas);
        System.out.printf("%nAlerta: %s", alerta ? "sim" : "não");
        System.out.printf("%nJogadores: %d", qtdJogadores);
        System.out.printf("%nPontos Jogadores: %d", pontosJogadores);
        System.out.printf("%n*******************************");
    
    } 
}
        


