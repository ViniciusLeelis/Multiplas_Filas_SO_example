package fatec.app.process;

/*
    Interface para forçar a implementação do escalonamento nas filas (Diz que fila tem um escalonamento)
*/

public interface Escalonamento {
    public void escalonamento(Processo processo);
}
