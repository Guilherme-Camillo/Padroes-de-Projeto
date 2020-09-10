
public class Main {

  public static void main(String[] args) {
    Gerente Sofia = new Gerente("Sofia");
    Vendedor João = new Vendedor("João", Sofia);
    Vendedor Pedro = new Vendedor("Pedro", Sofia);

    Time time = new Time();
    time.adicionarMembro(Sofia);
    time.adicionarMembro(João);
    time.adicionarMembro(Pedro);

    pagarDespesas(Sofia, 400);
    pagarDespesas(João, 200);
    pagarDespesas(Pedro, 200);
  }

  private static void pagarDespesas(Beneficiario beneficiario, int valor) {
    System.out.println("Necessário pagar despesas!!");
    beneficiario.pagarDespesas(valor);
    System.out.println("Valor Pago!\n");
  }

}

