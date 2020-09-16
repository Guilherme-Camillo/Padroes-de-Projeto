# Template Method

### Padrão Template Method

Este padrão é classificado como um padrão Comportamental. O Templete Method define na superclasse o esqueleto do algoritmo. Suas subclasses então pode sobscreverem etapas específicas desse algoritmo, porém não alteram a sua estrutura, mas a invocação do método ainda é feita do mesmo jeito que foi definido pela classe abstrata. Esse esqueleto podem possuir métodos, funções e operações.  

A intenção desse método é definir a estrutura geral da operação usando operações abstratas (ou não), enquanto permitindo suas subclasses aperfeiçoar, ou redefinar algumas etapas.

### Aplicações

Queremos usar esse método quando possuimos um algoritmo que:
- Possua uma estrutura hierarquica, e que podemos dividi-lo em etapas.
- Mais de um de seus componentes implementam esse algoritmo de forma semelhante, mas com pequenas diferenças em algumas etapas. 
- Precisamos fazer alterações de forma genérica ou especifica em cada classe.

### Estrutura

![Estrutura](https://refactoring.guru/images/patterns/diagrams/template-method/structure.png)

### Elementos do Padrão

- AbstractClass: É onde declaramos os métodos que agem como etapas de um algoritmo, e também método padrão que chama esses métodos em uma ordem específica. Os passos podem ser declarados como abstratos ou ter alguma implementação padrão.

- ConcreteClass1/ConcreteClass2: As Classes Concretas podem sobrescrever todas as etapas, mas não o próprio método padrão.

### Exemplo

[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/Template%20Method/Exemplo)

Neste exemplo foi criado o conceito de um Console de video-game. 

A classe `Console`Possuindo as classes abstratas: `abstract void inicializar();`, `abstract void iniciarJogo();` e `abstract void finalizar();` sem comportamentos, que são invocadas pelo outro método `abstract void play();`, que executam essas 3 classes abstratas em uma ordem.  

Depois criamos mais 2 classes `Futebol` e `Volei`, que serião equivalente aos jogos do console.  Nessas duas classes definimos os comportamentos para as classes `abstract void inicializar();`, `abstract void iniciarJogo();` e `abstract void finalizar();`. Apesar de serem bem semelhantes, eles implementam esses métodos de formas diferenetes, pois são jogos diferentes, e possuem comportamentos diferentes.  

Na classe `Main` invocamos a classe `Console` como `Console Futebol1 = new Futebol();` e `Console Volei1 = new Volei();`, assim passando os valores definidos nas classes `Futebol` e `Volei`.

Então podemos invocar o método `abstract void play();` para `Futebol1` e `Volei1`.  
`Futebol1.play();`  
`Volei1.play();`  

E então é executada a class `play()`, na estrutura que foi definida pelo `Console`, com os valores definidos nas classes `Futebol` e `Volei`. Cada um é executado com atributos diferentes por serem jogos diferentes e possuirem comportamentos diferentes.
