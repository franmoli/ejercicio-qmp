package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
  public List<Prenda> prendas = new ArrayList<Prenda>();

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void mostrarConjunto() {
    System.out.println("Conjunto guardado:");
    for (int i = 0; i < prendas.size(); i++) {
      int indice = i + 1;
      Prenda prenda = prendas.get(i);
      System.out.println("Prenda " + indice + ": ");
      System.out.println("Tipo " + prenda.tipo);
      System.out.println("Material " + prenda.material);
      System.out.println("Color principal " + prenda.colorPrincipal);
      System.out.println("Color secundario " + prenda.colorSecundario);
    }
  }
}
