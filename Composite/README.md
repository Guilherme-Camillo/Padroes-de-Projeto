# Composite
### Padrão Composite

  Esse padrão nos permite ter uma estrutura de árvore hierarquica com objetos semelhantes sendo tratados de maneira igual, onde precisamos de funcionalidades genéricas por toda sua estruta e ainda cada nó podendo performar uma tarefa diferente. Utiliza fortemente as definições de polimorfismo.

  Para isso declararamos uma interface que implementa comportamentos comuns para todas as classes. Assim podemos reutilizar as funções dessa interface por toda a estrutura da árvore, isso também facilita quando precisarmos adicionar outro objeto, nos permitindo importar sua estrutura já definida. 
  
  Elementos do padrão:
	-Component:
    Declara a interface para os objetos da composição e para acessar e administrar os seus filhos;
    Implementa comportamentos padrões comuns entre as classes;
    Declara uma interface para acessare gerenciar componentes filho.
    
  -Leaf
  Representa objetos filhos. Leafs não podem ter filhos. 
	Defini comportamente para os objetos primitivos da estrutura.
  
  -Composite	
	Define comportamente para componentes que possuem filhos.
	Guarda os componentes filhos.
	Implementa operações para os filhos na interface Component.
  
  -Client
	Manipula os objetos da composição através da interface component.


