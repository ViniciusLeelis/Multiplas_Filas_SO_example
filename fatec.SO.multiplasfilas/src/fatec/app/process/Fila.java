package fatec.app.process;

import java.util.List;
import java.util.Vector;

/*
    Classe abstrata que será herdada pelas demais para caracaterizar as filas
*/
public abstract class Fila{
    
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
}
