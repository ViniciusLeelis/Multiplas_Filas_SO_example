package fatec.so.multiplasfilas;

import java.util.concurrent.TimeUnit;

public class Processo {
    private int id;
    private int prioridade;
    private boolean exec;
    private int tempo;
    public Processo(int id, int prioridade, int tempo) {
        this.id = id;
        this.prioridade = prioridade;
        this.tempo = tempo;
    }
    public int getId(){
        return id;
    }
    
    public int getPrioridade(){
        return prioridade;
    }
   
    public void executaProcesso() throws InterruptedException {
        this.exec = true;
        TimeUnit.SECONDS.sleep(3); // Dorme por 3 segundos
        this.exec = false;
    }
    public boolean returnEstado() {
        return exec;
    }
    
}
