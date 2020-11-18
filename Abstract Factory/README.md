# Abstract Factory 

### Padrão Abstract Factory

É definido como um Padrão Criacional. Comumente utilizado em Frameworks, possui maior nível de abstração que o Factory Method.
Permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas, utilizando apenas 1 interface.

### Objetivo

Prover uma interface para criar uma família de objetos relacionados ou dependentes sem especificar suas classes concretas.  
Reduzir acoplamento entre objetos mesmo quando estes tem dependência entre eles.  

### Aplicações

- **Use o Abstract Factory quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que você não quer depender de classes concretas daqueles produtos eles podem ser desconhecidos de antemão ou você simplesmente quer permitir uma futura escalabilidade.**

- **Sistema deve ser independente de como seus produtos são criados, compostos e representados.**

- **Sistema deve ser configurado com uma entre várias famílias de produtos.**

- **Uma família de produtos relacionados foi projetada para uso conjunto e você deve implementar essa restrição.**

- **Fornecer uma biblioteca de classes e quer revelar sua interface e não sua implementação.**

### Estrutura
![Estrutura](https://refactoring.guru/images/patterns/diagrams/abstract-factory/structure.png)

### Elementos do Padrão

- **Client**: O Cliente pode trabalhar com qualquer variante de produto/fábrica concreto, desde que ele se comunique com seus objetos via interfaces abstratas. 

- **Produtos Abstratos**: Declaram interfaces para um conjunto de produtos distintos mas relacionados que fazem parte de uma família de produtos.  

- **Produtos Concretos**: são várias implementações de produtos abstratos, agrupados por variantes. Cada produto abstrato (cadeira/sofá) deve ser implementado em todas as variantes dadas (Vitoriano/Moderno).  

- **Fábrica Abstrata**: Essa interface declara um conjunto de métodos para criação de cada um dos produtos abstratos.  

- **Fábricas Concretas**: Implementam métodos de criação fábrica abstratos. Cada fábrica concreta corresponde a uma variante específica de produtos e cria apenas aquelas variantes de produto.  


### Exemplo
[Link para o código]()
