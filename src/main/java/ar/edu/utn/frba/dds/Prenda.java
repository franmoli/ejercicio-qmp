package ar.edu.utn.frba.dds;

public class Prenda {
  TipoDePrenda tipo;
  Material material;
  Colores colorPrincipal;
  Colores colorSecundario;

  public Prenda(TipoDePrenda tipo, Material material, Colores colorPrincipal, Colores colorSecundario) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }
  public Prenda(TipoDePrenda tipo, Material material, Colores colorPrincipal) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = Colores.NO_DEFINIDO;
  }

}
