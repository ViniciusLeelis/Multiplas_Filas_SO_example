/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.so.multiplasfilas;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class FilaBatch implements Fila{
    
    private List<Processo>listBatch = new LinkedList<>();
    
    @Override
    public void addProcesso(Processo processo) {
        if(!getFull())
            listBatch.add(processo);
        else
            JOptionPane.showMessageDialog(null, "lista cheia !");
    }

    @Override
    public void removeProcesso(Processo processo) {
        if(!getEmpty())
            listBatch.remove(0);
        else
            JOptionPane.showMessageDialog(null, "lista vazia !");

    }

   
    public boolean getFull() {
    if(listBatch.size()==4)
        return true;
    return false;
    }
    public boolean getEmpty() {
    if(listBatch.size()==0)
        return true;
    return false;
    }
    
}