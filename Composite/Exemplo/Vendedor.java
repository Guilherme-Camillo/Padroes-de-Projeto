public class Vendedor implements Beneficiario {

  private String nome;
  private Gerente gerente;

  public Vendedor(String nome, Gerente gerente) {
    this.nome = nome;
    this.gerente = gerente;
  }

  public void pagarDespesas (int valor) {
    System.out.println(nome + " Recebeu R$" + valor);
  }
}