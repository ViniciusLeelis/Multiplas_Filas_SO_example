package fatec.app.process;

import java.util.concurrent.TimeUnit;

public class Processo {
    private String idColor;
    private int id;
    private int prioridade;
    private boolean exec;
    private int tempo;
    
    public Processo(String idColor, int id, int prioridade, int tempo) {
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
   
    public int getTempo(){
        return tempo;
    }
    public boolean returnEstado() {
        return exec;
    }
    
}
