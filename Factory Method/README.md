# Factory Method

### Padrão Factory Method

É definido como um Padrão Criacional que define uma interface para criar objetos em uma superclasse, mas permitindo que as subclasses decidam qual classe instanciar. Permite também alterar o método de criação através de subclasses.

### Objetivo

 Disponibilizar método que permite criar objetos, centralizando as dependências em um único ponto.
 
  O Factory Method separa o código de construção do produto do código que realmente usa o produto. Portanto, é mais fácil estender o código de construção do produto independentemente do restante do código.
 
 Especialmente útil quando a criação envolve uma séria de objetos (hierarquia)
 
 Reduzir acoplamento por meio do princípio da responsabilidade única.
 
 ### Aplicações

- **Podemos utilizar quando não sabemos os tipos e dependências exatas dos objetos com os quais o código deve funcionar.**

- **Quando desejar fornecer aos usuários da sua biblioteca ou framework uma maneira de estender seus componentes internos.**

- **Economizar recursos do sistema reutilizando objetos existentes em vez de recriá-los sempre.**


### Estrutura
![Estrutura](https://arquivo.devmedia.com.br/artigos/Higor_Medeiros/padraofactory/image001.jpg)

### Elementos do Padrão

- **Client**: É quem tem dependência com IProduct.  
- **Creator**: A classe Creator declara o FactoryMethod que retorna novos objetos produto. É importante que o tipo de retorno desse método corresponda à interface do produto.  
- **IProduct**:O Produto declara a interface, que é comum a todos os objetos que podem ser produzidos pelo criador e suas subclasses.  
- **ProductA,B...**: Produtos Concretos são implementações diferentes da interface do produto.  

### Exemplo
[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/Factory%20Method/Examplo)

Neste exemplo vamos criar uma simples "fábrica de cachorros" que pode retornar alguns tipos de cachorros, onde esse cachorro retornado corresponde a um critério definido na classe DogFactory.  

Esses critérios foram definidos como "small", "big" e "working", se eu pedir um deles a fábrica ira me mostrar um cachorro correspondente.

Primeiro criamos a interface "Dog", qualquer cachorro que fizermos retornar precisa implementar essa interface antes. Ela apenas possui o método speak() que cada tipo de cachorro deve implementar. 

Agora criamos cachorros de diferentes raças que implementam essa interface e o seu método speak() mas de maneira ligeiramente difrentes, apropriada para a raça do cachorro.

Então definimos nossa classe "DogFactory" com um static method "getDog" que retorna um cachorro dependendo dos critérios fornecidos. A fábrica não diz que está retornando uma raça de cachorro, mas sim algo que está implementando a interface "Dog".

Na classe Main demosntramos como obter diferentes tipos de cachorros, criando intâncias de cada tipo de cachorro (small, big ou working).
