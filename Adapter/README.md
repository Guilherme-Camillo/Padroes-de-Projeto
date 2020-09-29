# Adapter

### Padrão Adapter

É um padrão Estrutural. Também conhecido como "Wrapper". Permite que uma interface já existente, seja usada por outra interface. Comumente usada para fazer classes existentes funcionarem com outras, sem modificar o código fonte.

### Objetivo
Converter a interface de uma classe em outra interface esperada pelos clientes. Permite que as classes com interfaces incompatíveis trabalhem em conjunto.  

### Aplicações
Integrar sistema legado a um novo sistema.  
Quando se precisa conectar uma biblioteca de classes, muitas vezes em formato antigo, sem impactar a estrutura do novo sistema.
Criar uma classe reutilizável que coopere com classes não relacionadas ou não previstas.
Muito utilizado para compatibilizar o novo sistema com Frameworks ou APIs externos.

### Estrutura
![Estrutura](http://videos.web-03.net/artigos/Higor_Medeiros/PadraoAdapter_Java/PadraoAdapter_Java1.jpg)

### Elementos do Padrão
- Target -> Define a interface usada pelo cliente para atingir sua funcionalidade/solicitação.
- Cliente -> Usa o objeto da interface Target conforme definido, visualiza somente o Target.
- Adaptee -> Esta é uma classe que possui a funcionalidade exigida pelo Client e que precisa ser adaptado.
- Adapter -> É quem adapta a interface do Adeptee ao Target usado pela aplicação. É responsável pela comunicação entre o Client e o Adaptee.

### Exemplo
[Link para o código](https://github.com/Guilherme-Camillo/Padroes-de-Projeto/tree/master/Adapter/Exemplo)

O exemplo utilziado neste código é de um tocador MP3, que para tocar arquivos .MP4, precisa de um adaptador.  

Temos as interfaces `MediaPlayer.java`, que implementa arquivos MP3 e `MediaPackage.java` que implementa arquivos MP4.

Queremos utilizar MP4 como instancias de `MediaPlayer.java`, para isso precisamos de um adaptador que é o `FormatAdapter.java`

Dessa forma podemos executar o código do nosso arquivo `Main.java`, fazendo um arquivo .MP4 invocar o método `play` da interface `MédiaPlayer`, utilizando o adaptador.



