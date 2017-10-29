package fatec.app.process;

import javax.swing.JOptionPane;

public class FilaBatch extends Fila implements Escalonamento, Runnable{
    
    private int prioridadeFila = 1;
    private int tempoLimite = 10; 
    
    private Processo[] processos;
    private int primeiro;
    private int ultimo;
    private int total;
    
    public FilaBatch(){
        this.setPrioridade(1);
        
        primeiro = 0;
        ultimo = 0;
        total = 0;
        processos = new Processo[5];
    }
    
    public void addProcesso(Processo processo){
        if(isFull()){
            throw new RuntimeException("A fila de processos está cheia");
        }
        escalonamento(processo);
    }
    
    public Processo removeProcesso(){
        if (isEmpty()){
            throw new RuntimeException("A fila de processos está vazia");
        }
        Processo temp = processos[primeiro];
        total--;
        return temp;
    }
                
    @Override
    public boolean isEmpty(){
        return total == 0;
    }
    
    public boolean isFull(){
        return total == processos.length;
    }
            
            
    @Override
    public void escalonamento(Processo processo) {
        processos[ultimo] = processo;
        ultimo = (ultimo + 1) % processos.length;
        total++;
    }
    
    @Override
    public void run(){
        while (!isEmpty()){
            for (int i = 0; i < processos.length; i++){
                for (int j = 0; j < tempoLimite; j++){
                    if (processos[i].getExec()){
                        try {
                            Thread.sleep(5 * 1000);
                        } catch (InterruptedException ex) {
                            JOptionPane.showMessageDialog(null, "Erro ao tentar executar o processo interativo");
                        }
                        processos[i].setTempo(processos[i].getTempo() - j);
                    }
                }
                if (processos[i].getTempo() < 0){
                    processos[i].setExec(false);
                }
            }
        }
    }
}