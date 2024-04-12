package ar.edu.utn.frba.dds;

public class Main {
  public static void main(String[] args) {
    Prenda zapato = new Prenda(TipoDePrenda.ZAPATO, Material.CUERO, Colores.ROJO);
    Prenda remera = new Prenda(TipoDePrenda.REMERA, Material.ALGODON, Colores.NEGRO);
    Prenda pantalon = new Prenda(TipoDePrenda.PANTALON, Material.JEAN, Colores.AZUL);

    Conjunto conjunto1 = new Conjunto();

    conjunto1.agregarPrenda(zapato);
    conjunto1.agregarPrenda(remera);
    conjunto1.agregarPrenda(pantalon);

    conjunto1.mostrarConjunto();
  }
}