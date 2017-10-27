# Escalonamento por múltiplas filas

Neste tipo de escalonamento os processos deixam de ter prioridades, e esta característica passa a ser das filas. Aqui a preempção ocorre quando um processo entra em uma fila de maior prioridade, isso em relação a fila que está executando o processo no momento.

O interessante aqui é notar que cada fila possui internamente um sistema para escalonar os processos. Neste projeto para facilitar, usamos como base o exemplo do livro <code>Arquitetura de sistemas operacionais 4º Edição</code>, neste exemplo as filas são divididas em três grupos, e são eles:

* Fila de processos do sistema:
	* Fila de maior prioridade;
	* Implementa internamente escalonamento de prioridades.
* Fila de processos interativos:
	* Fila com prioridade média;
	* Implementa internamente ecalonamento circular.
* Fila de processos batch:
	* Fila com prioridade baixa;
	* Algoritimo de escalonamento igual ao <code>interativo</code>