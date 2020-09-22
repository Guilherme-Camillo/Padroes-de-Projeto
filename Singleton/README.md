# Singleton

### Padrão Singleton

É um padrão Criacional. Como o nome sugere ele é usado para criar apenas uma e única instancia de uma classe.  

E para garantir que essa classe, que queremos que seja o Singleton seja instanciada apenas uma vez devemos tornar o construtor dela como privado. Dessa forma, apenas os membros dela podem acessar esse construtor privado e mais ninguém.  

O padrão Singleton é definido de forma que apenas uma única instância da classe exista e um ponto global para acessar ela.

Como é definida a classe do Singletom:
- Criar um construtor privado, que restringe o acesso para qualquer objeto fora dessa classe.
- Criar um atributo privado, que refere para esse objeto singleton
- Criar um método public static, que nos permita criar e acessar o objeto que foi criado. Dentro desse método criaremos uma condição que nos restringe de criar mais que um objeto.

### Aplicações

Existem vários motivos para querer que apenas uma única instancia de uma classe deva existir. Logs, variavéis de configuração e recursos de hardware compartilhados são exemplos de objetos que devem ter apenas uma única instância.  

- Logs:

Logs normalmente são utilizados por quase todas as classes de um sistema, e não retornam nenhuma informação que afeta o comportamento da aplicação. Este é um caso no qual o singleton pode ser bem empregado.  

- Variáveis de configuração:

Variáveis de configuração podem ser carregadas ao iniciar o sistema, e normalmente não são alteradas diretamente pela aplicação. Utilizar uma classe singleton para armazenar essas informações pode funcionar como um cache em memória para que não seja necessário “buscar” essa informação toda vez que uma delas for requisitada.  

- Acessar recursos de hardware compartilhado:

Uma aplicação multi-thread que necessite acessar recursos de um hardware onde o mesmo não foi feito para trabalhar dessa forma pode se beneficiar desse padrão. Isso porque todas as classes que necessitarem acessar algum recurso do hardware deverão utilizar a mesma instância da classe singleton. Esta será responsável por controlar todas as operações de comunicação entre a aplicação e o hardware.  

### Estrutura
![Estrutura](https://refactoring.guru/images/patterns/diagrams/singleton/structure-pt-br.png)

### Elementos do Padrão

- Singleton: A classe Singleton declara o método estático `getInstance()` que retorna a instância única de sua própria classe.
O construtor da singleton deve ser escondido do código client. Chamando o método getInstance deve ser o único modo de obter o objeto singleton.

- Client: Pode invocar apenas o método `getInstance()` do singleton, porém não tem acesso ao seu construtor.

### Exemplo
[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/Singleton/Exemplo)

Neste exemplo foi criado o conceito de um Banco de Dados.  

Foi criado a classe singleton `Database`  

Dentro delas temos uma instância `private static Database DBinstance = null;`, que ira referir ao objeto da classe `Database` como nulo.  

O construtor privado `Database()` que previne a criação do objeto fora da classe.

A classe `public static Database getInstance()` que retorna a instância da classe, caso ela seja nula (não exista).

E por fim temos a mensagem de conexão do servidor `public void getConnection()`  

Na classe Main, temos uma váriavel de classe `Database` como db1.

db1 que está invocando o `getInstance()` -> 	`Database db1 = Database.getInstance();`

Desa forma o db1, sendo um objeto de `Database`, ela pode chamar o método `db1.getConnection();`
