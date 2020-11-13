# State

### Padrão State

É um padrão Comportamental, permite um objeto alterar seu comportamento quando o seu estado interno é modificado.

### Objetivo

Permitir a um objeto possuir diversos estados a partida das informações contidas na sua instância e retornar comportamentos diferentes com base nesse estado. 

Ao invés de implementar todos os comportamentos seperados, o objeto 'Context' armazena uma referência para um dos objetos de estado que representa seu estado atual e delega o trabalho relacionado aos estados daquele objeto.  
Dessa forma minimizando a complexidade das declarações condicionais.

### Aplicações

É utilizado quando precisamos gerenciar comportamentos diferentes dependendo de um número de estados diferentes ou também quando temos um conjunto de instruções condicionais complicadas.

Máquina de estados de comunicação com um sistema. Dependendo do estado de comunicação podem ter diferentes comandos trocados entre os sistemas.

Controle de estados de conexão com a internet.

Em grandes projetos, você deve alterar o comportamento do objeto dependendo de seu estado (em projetos de pequeno e médio porte, usar o padrão State não faz sentido, ele apenas adiciona lógica complicada desnecessária).

### Estrutura
![Estrutura](https://refactoring.guru/images/patterns/diagrams/state/structure-pt-br-indexed.png)

### Elementos do Padrão

- Context: Armazena um referência a um dos ojbetos concreto de estado e delega a eles todos os trabalhos específicos de estado. O contexto se comunica com o objeto estado através da interface do estado. O contexto expõe um setter para passar a ele um novo objeto de estado.

- State: Essa interface declara métodos específicos a estados. Esses métodos devem fazer sentido para todos os estados concretos, para não ocorrer dos estados possuirem métodos inutilizados que não serão chamados.

- ConcreteState: Um ou mais estados concretos que implementam a interface estado. Fornecem suas próprias implementações para os métodos específicos de estados. 

### Exemplo
[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/State/Exemplo)

Vamos criar uma interface State, definindo um comando doAction, e criamos duas classes que vão implementar essa interface 'StartState.java' e 'StopState.java' e o comando doAction conforme sua função.

Depois fazemos nossa classe Context que é a classe que carrega o State (estado).

Assim na classe main usamos o Context ver as mudanças no comportamento quando o State muda.








