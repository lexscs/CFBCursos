public class CarroCombate extends Carro{
    /* neste arquivo está o conceito de herança CarroCombate recebe todo o conteúdo da classe Carro */

    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qtdArmamento;

    public CarroCombate(String nome, int blindagem){
        super(nome);
        super.setArmamento(true);
        setBlindagem(blindagem); /* pode-se omitir o super que herda da classe pai*/
        this.qtdArmamento = 100;
    }

    public void setQtdeArmamento(int qtdArmamento) {
        this.qtdArmamento += qtdArmamento;
        if(this.qtdArmamento > MAX_ARMAMENTO){
            this.qtdArmamento = MAX_ARMAMENTO;
        }

        if(this.qtdArmamento < MIN_ARMAMENTO){
            this.qtdArmamento = MIN_ARMAMENTO;
        }
    }

    public int getQtdArmamento(){
        return this.qtdArmamento;
    }

    public void atirar(){
        if(this.qtdArmamento > MIN_ARMAMENTO){
            setQtdeArmamento(-1);
        } else {
            System.out.println("Sem munição!!!");
        }


    }

    public void info(){
        super.info();
        System.out.printf("Qtde Mun....: %d%n", this.qtdArmamento);

    }

}
