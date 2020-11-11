# Strategy

### Padrão Strategy

É um padrão Comportamental, também é chamado de Policy. Sua função é delegar responsabilidade, para assim aumentar a coesão e aprimorar a comunicação entre objetos. Permite também que o algoritmo varie independentemente dos clientes que o utilizam.

### Objetivo

Permite definir novos algortimos sem alterar as classes dos elementos sobre os quais opera.  

Nos permite configurar uma classe com vários comportamentos, utilizando o conceito de OO de composição.  

Garante a intercambialidade.  


### Aplicações

É utilizado quando se possui muitas classes que se relacionam e que atuam de formas diferentes. E quando temos necessidade de intercambiar o algortimo confrome as condições de chamada.

Pode ser usado em sistemas de call center, utilizando informações prévias para fonrecer o caminho específico para resolver algum problema.

Calculo de ocmissão de corretagem, aplicando regra específica para cada participante da venda, de acordo com sua função.

Fornecer descontos e condições especiais de compra a certo cliente dependendo de suas condições.



### Estrutura
![Estrutura](https://robsoncastilho.files.wordpress.com/2011/04/strategy.gif?w=736)

### Elementos do Padrão

- Context: Define e mantém a referência para uma classe Strategy específica.

- Strategy: Interface ou classe abstrata comum a todos os algortimos suportados. 

- ConcreteStrategy: Um ou mais algoritmos fornecidos para a aplicação.   

### Exemplo
[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/Strategy/Exemplo)

Primeiro criamos a interface `Srategy` com a operação `doOperation` e atribuimos 2 ints para ela.

Depois definimos 3 classes que serão nossas operaçãos e implementam nossa interface, fizemos a soma, subtração e multiplicação.

Agora criamos a classe `Context` com uma referência para a nossa classe Strategy, que com o comando `executeStrategy` nos permite retornar `strategy.doOperation`. 

Na classe main usamos a classe `Context` para mudar o comportamente conforme a `Strategy` muda. E assim executamos 3 operações com o contexto diferente obtendo 3 resultados diferentes (soma, subtração e multiplicação).





