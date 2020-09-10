import java.util.ArrayList;
import java.util.List;

public class Time implements Beneficiario {

  private List<Beneficiario> beneficiarios = new ArrayList<>();

  public void pagarDespesas(int valor) {
    beneficiarios.forEach(beneficiario -> beneficiario.pagarDespesas(valor));
  }

  void adicionarMembro (Beneficiario beneficiario) {
    beneficiarios.add(beneficiario);
  }

}
