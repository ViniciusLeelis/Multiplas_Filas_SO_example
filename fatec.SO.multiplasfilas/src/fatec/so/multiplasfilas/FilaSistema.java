/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.so.multiplasfilas;


import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class FilaSistema implements Fila{
    
        private List<Processo>listSistema = new LinkedList<>();

    @Override
    public void addProcesso(Processo processo) {
        if(!getFull()) 
            listSistema.add(processo);
        else
            JOptionPane.showMessageDialog(null, "lista cheia !");
    }

    @Override
    public void removeProcesso(Processo processo) {
        if(!getEmpty()) 
            listSistema.remove(0);
        else
            JOptionPane.showMessageDialog(null, "lista vazia !");

    }
    public void checkProcessos(Processo processo) throws InterruptedException {
        Thread.sleep(processo.getTempo()*1000);
        listSistema.remove(processo);
        System.out.println("Legal");
    }
    

    

   
    public boolean getFull() {
    if(listSistema.size()==4)
        return true;
    return false;
    }
    public boolean getEmpty() {
    if(listSistema.size()==0)
        return true;
    return false;
    }
    
}
