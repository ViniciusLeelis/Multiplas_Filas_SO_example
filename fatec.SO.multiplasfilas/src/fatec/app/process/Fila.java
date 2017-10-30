package fatec.app.process;

import java.util.List;
import java.util.Vector;

/*
    Classe abstrata que será herdada pelas demais para caracaterizar as filas
*/
public abstract class Fila implements Comparable{
    
    private  int prioridade;
    private boolean containsProcess;
    
    List<Processo> processos = new Vector<>();
    
    public void addProcesso(Processo processo){
        processos.add(processo);
    }
    public Processo removeProcesso(Processo processo){
        Processo temp = processos.get(processos.size());
        processos.remove(temp);
        return temp;
    }
    
    public List<Processo> getFila(Processo processo) {
        return processos;
    }
    
    public boolean isEmpty(){
        return processos.isEmpty();
    }
    
    public boolean getContainsProcess(){
        if (this.containsProcess){
            return true;
        } else {
            return false;
        }
    }
    
    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }
    
    public int getPrioridade(){
        return prioridade;
    }
    
    @Override
    public int compareTo(Object t) {
        if (((Fila)t).getPrioridade() == 5){
            return 1;
        } else if (((Fila)t).getPrioridade() == 3){
            return 0;
        } 
        return -1;
    }
}
