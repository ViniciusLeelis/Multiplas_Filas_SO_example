package fatec.app.process;

import javax.swing.JOptionPane;

public class FilaSistema extends Fila implements Escalonamento, Runnable{
    
    private int delay;
    
    @Override
    public void escalonamento(Processo processo) {
        // Escalonamento de prioridades
        // Maior prioridade == Passa a ser executado
        
        if (processo.getPrioridade() >= 4 && processo.getPrioridade() <= 5){
            this.delay = processo.getTempo();
        }
    } 
    
    @Override
    public void run(){
        try {
            // A thread irá executar este processo
            System.out.println("Processo sendo executado");
            Thread.sleep(delay * 1000);
            System.out.println("Processo finalizado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar executar o processo: \n" + ex.getMessage());
        }
    }
}
