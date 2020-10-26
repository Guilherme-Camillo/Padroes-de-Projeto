# Memento

### Padrão Memento

É um padrão Comportamental, que nos permite salvar e restaurar o estado anterior de um objeto sem revelar os detalhes de sua implementação.

### Objetivo

Quando houver necessidade de registrar o estado interno de um objeto para implementação de mecanismos de checkpoints e para desfazer operações no caso de erros.

Porém, objetos normalmente encapsulam parte ou todos os seus estados, tornando-os inacessíveis a outros objetos e impossíveis de serem salvos externamente. Expor este estado violaria o encapsulamento, o que pode comprometer a confiabilidade e a extensibilidade da aplicação.  

O objetivo do padrão é fornecer um mecanismo para permitir atender esta demanda sem violar o princípio de encapsulamento da Orientação a Objetos.  

### Aplicações

O padrão Memento permite que você faça cópias completas do estado de um objeto, incluindo campos privados, e armazená-los separadamente do objeto. Embora a maioria das pessoas vão lembrar desse padrão graças ao caso “desfazer”, ele também é indispensável quando se está lidando com transações (isto é, se você precisa reverter uma operação quando se depara com um erro).

O Memento faz o próprio objeto ser responsável por criar um retrato de seu estado. Nenhum outro objeto pode ler o retrato, fazendo do estado original do objeto algo seguro e confiável.  


### Estrutura
![Estrutura](https://refactoring.guru/images/patterns/diagrams/memento/structure1.png)

### Elementos do Padrão

- Originator: o objeto para o qual o estado atual deve ser salvo. Define método que permite criar um Memento com o estado atual do Originador armazenado no Memento retornado. Originator também tem um
método que define seu estado atual com o estado de um determinado objeto Memento. Portanto, pode criar um Snapshot (Memento) ou restaurar o estado do Snapshot fornecido (Memento).  

- Memento: classe que representa um snapshot, contendo o estado de um objeto a ser restaurado em um Originador. Possui métodos para obter e definir o estado que um Memento encapsula dentro.  

- Caretaker: classe auxiliar responsável por armazenar e restaurar o estado do Originador por meio do objeto Memento. Um objeto Caretaker mantém os Mementos, mas nunca modifica os Mementos.  

### Exemplo
[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/Observer/Exemplo)

