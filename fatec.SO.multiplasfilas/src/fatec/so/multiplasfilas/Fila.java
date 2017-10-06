package fatec.so.multiplasfilas;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Processo>listSistema = new ArrayList<>();
    List<Processo>listInterativo = new ArrayList<>();
    List<Processo>listBatch = new ArrayList<>();
    
    public void addSistema(Processo processo) {
       listSistema.add(processo);
    }
    public void addInterativo(Processo processo) {
       listInterativo.add(processo);
    }
    public void addBatch(Processo processo) {
       listBatch.add(processo);
    }
    public void removeFIlaSistema(int id) {
       for(Processo processo: listSistema) {
           if(processo.getId()==id) {
               listSistema.remove(processo);
           }
       }
    }
    public void removeFIlaInterativo(int id) {
       for(Processo processo: listInterativo) {
           if(processo.getId()==id) {
               listInterativo.remove(processo);
           }
       }
    }
    public void removeFIlaBatch(int id) {
       for(Processo processo: listBatch) {
           if(processo.getId()==id) {
               listBatch.remove(processo);
           }
       }
    }
    
}
