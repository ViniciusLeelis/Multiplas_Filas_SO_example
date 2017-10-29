package fatec.app.process;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FilaSistema extends Fila implements Escalonamento, Runnable{
    
    private int prioridadeFila = 5;
    
    @Override
    public void escalonamento(Processo processo) {
        Collections.sort(processos);
    }
    
    public int getPrioridadeFila(){
        return prioridadeFila;
    }
    
    @Override
    public void run(){
        while (!this.isEmpty()){   
            int i = 0;
            int tempoEmExecucao = 0;
                try {
                    Thread.sleep(5 * 1000);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao executar o processo");        
                }
                tempoEmExecucao++;
                processos.get(i).setTempo(processos.get(i).getTempo() - tempoEmExecucao);
                
                if (processos.get(i).getTempo() == 0){ 
                    processos.remove(processos.get(i));
            }
        }
    }
}
