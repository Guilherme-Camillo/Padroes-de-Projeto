# Composite
### Padrão Composite

  Esse padrão nos permite ter uma estrutura de árvore hierarquica com objetos semelhantes sendo tratados de maneira igual, onde precisamos de funcionalidades genéricas por toda sua estruta e ainda cada nó podendo performar uma tarefa diferente. Utiliza fortemente as definições de polimorfismo.

  Para isso declararamos uma interface que implementa comportamentos comuns para todas as classes. Assim podemos reutilizar as funções dessa interface por toda a estrutura da árvore, isso também facilita quando precisarmos adicionar outro objeto, nos permitindo importar sua estrutura já definida. 

### Elementos do padrão

 - **Component**

-Declara a interface para os objetos da composição e para acessar e administrar os seus filhos;  
-Implementa comportamentos padrões comuns entre as classes;  
-Declara uma interface para acessare gerenciar componentes filho.
      
- **Leaf**

-Representa objetos filhos. Leafs não podem ter filhos;  
-Define comportamente para os objetos primitivos da estrutura.

- **Composite**

-Define comportamente para componentes que possuem filhos;  
-Guarda os componentes filhos;  
-Implementa operações para os filhos na interface Component.
    
- **Client**

-Manipula os objetos da composição através da interface component.

### Exemplo
Exemplo retirado da atividade feita no curso: Java Designt Patterns: Structural, de Linkeding Learning. 

Algoritmo feito para pagar as despesas de funcionários de um time de vendedores. 

Foi criado uma interface que define o método 'pagarDespesas' sem definições.

Implementamos essa interface em todas as outras classes, e definimos ela de acordo com a classe.

Antes de implementar o Composite, cada classe possuia um método para realizar o pagamento. Após implementar ficamos apenas com um método genérico para Beneficiario, que pode ser invocado por qualquer classe (Gerente, Vendedor ou Time).

Se precisarmos adicionar outra classe como por exemplo (Atendente), podemos implementar a interface beneficiário.

Assim lidamos os objetos ou grupos de objetos da mesma forma.

**Conclusão**

Esse padrão é geralmente utilizado quando precisamos de estrutura de árvores, onde os componentes de sua estrutura, precisam de um comportamento padrão bem definido. Onde os componentes podem ser objetos ou grupos de objetos.
