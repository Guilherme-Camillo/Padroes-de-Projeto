
public class Main {

  public static void main(String[] args) {
    Gerente Sofia = new Gerente("Sofia");
    Vendedor Jo�o = new Vendedor("Jo�o", Sofia);
    Vendedor Pedro = new Vendedor("Pedro", Sofia);

    Time time = new Time();
    time.adicionarMembro(Sofia);
    time.adicionarMembro(Jo�o);
    time.adicionarMembro(Pedro);

    pagarDespesas(Sofia, 400);
    pagarDespesas(Jo�o, 200);
    pagarDespesas(Pedro, 200);
  }

  private static void pagarDespesas(Beneficiario beneficiario, int valor) {
    System.out.println("Necess�rio pagar despesas!!");
    beneficiario.pagarDespesas(valor);
    System.out.println("Valor Pago!\n");
  }

}

