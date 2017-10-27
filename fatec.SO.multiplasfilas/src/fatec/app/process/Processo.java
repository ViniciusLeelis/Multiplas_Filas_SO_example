package fatec.app.process;

/*
Classe de estrutura de um processo
*/
public class Processo {
    private int id;
    private int prioridade; // Prioridade == 5 (Alta); Prioridade == 3 (Média); Prioridade > 0 && Prioridade < 1 (Baixa)
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
   
    public int getTempo(){
        return tempo;
    }
    
    public void setExec(boolean exec){
        this.exec = exec;
    }
    
    public boolean getExec(){
        return exec;
    }
    
}
