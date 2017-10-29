package fatec.app.process;

/*
Classe de estrutura de um processo
*/
public class Processo implements Comparable{
    private int id;
    private int prioridade; // Prioridade == 5 (Alta); Prioridade == 3 (Média); Prioridade > 0 && Prioridade < 1 (Baixa)
    private boolean finalizado;
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
    
    public void setTempo(int tempo){
        this.tempo = tempo;
    }
   
    public int getTempo(){
        return tempo;
    }
    
    public void setExec(boolean finalizado){
        this.finalizado = finalizado;
    }
    
    public boolean getExec(){
        return finalizado;
    }

    @Override
    public int compareTo(Object t) {
        if (this.prioridade > ((Processo)t).getPrioridade() ){
            return 1;
        } else if (this.prioridade < ((Processo)t).getPrioridade()){
            return -1;
        } else {
            return 0;
        }
    }
}
