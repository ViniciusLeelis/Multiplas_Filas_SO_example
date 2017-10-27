package fatec.app.process;

public class FilaSistema extends Fila implements Escalonamento{

    @Override
    public void escalonamento(Processo processo) {
        // Escalonamento de prioridades
        // Maior prioridade == Passa a ser executado
    } 
}
