public class Gerente implements Beneficiario {

  private String nome;

  public Gerente (String nome) {
    this.nome = nome;
  }

  public void pagarDespesas (int valor) {
    System.out.println(nome + " Recebeu R$" + valor);
  }

}