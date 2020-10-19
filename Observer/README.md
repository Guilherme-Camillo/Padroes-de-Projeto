# Observer

### Padrão Observer

É um padrão Comportamental. Nos permite definir um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.  
Atua em tempo de run-time.  
O Java, por exemplo, tem entidades que nos permitem implementar esse padrão abstraindo em muito a codificação que seria necessária sem a utilização dessas entidades.  

### Objetivo

O Observer é útil quando precisamos que dois ou mais objetos "escutem" a determinados eventos em um outro objeto.  
Receber notificações sobre mudanças de estado em outros objetos quando esta mudança for relevante.  

### Aplicações

Bastante utilizado em redes sociais, por exemplo para enviar notificações de status update da pessoa que você está seguindo. (Podendo deixar de seguir e parar de receber notificações).  

Na programação, o padrão observer é a base dos aplicativos orientados a mensagens. Quando um aplicativo atualiza seu estado, ele notifica os assinantes sobre as atualizações. Frameworks como HornetQ e JMS trabalham neste padrão.  

Da mesma forma, na programação baseada em UI Java, todos os eventos de teclado e mouse são tratados por seus objetos ouvintes e funções designadas. Quando o usuário clica com o mouse, a função inscrita no evento de clique do mouse é chamada com todos os dados de contexto passados para ela como argumento do método.  

### Estrutura
![Estrutura](https://www.thiengo.com.br/img/post/normal/jbtt0ovoqvlsllftsj1r7jkp23fedb51c7ce5e5b073a1aec55bf447871.jpg)

### Elementos do Padrão

- Subject -> é a classe que possui a informação o estado que se deseja observar. Possui os métodos para adicionar ou remover os objetos que serão observados.
- Observer -> Interface ou classe abstrata que define os métodos de notificação de interesse dos observadores
- Observer_1,Observer_2,Observer_3 ->  Classes concretas que observam a classe Subject.


### Exemplo
[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/Observer/Exemplo)

Vamos supor que uma rede de lojas deseja notificar seus clientes sobre uma venda em andamento.

O sistema enviaria uma mensagem curta para todos os clientes assinados sempre que uma venda fosse ativada.

Nesse caso, nossa Store é a classe que será observada, e nossos consumidores estão observando ela. Assim definimos as interfaces Subject e Observer.

A interface Subject é bem simples. Nos da os métodos para add ou remove subscribers/observe e os notificas sobre mudanças.

A interface Observer é mais simples ainda, a única coisa que precisa é saber quando teve um update do seu subject. Seu comportamente é diferente entre as classes.  

Nosso Subject será a Loja (Store). A loja contém uma lista de Observers (clientes) e implementa os métodos para adição e remoção de clientes da lista. 

O método `notifySubscribers()` faz um loop pela lista de clientes e os envia um update.  

Podemos ter quantos Observers quisermos. Cada consumidor reage de forma difrente a uma promoção.  

Assim fazemos a implementação de dois tipos de clientes: ShopaholicCustomer e PassiveCustomer  

No main definimos algumas promoçãoes em nossa loja, sendo observadas pelos nossos clientes, para ver o Observer em ação. 
