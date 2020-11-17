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
[Link para o código]()

