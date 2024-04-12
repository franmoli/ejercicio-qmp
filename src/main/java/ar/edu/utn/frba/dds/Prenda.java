package ar.edu.utn.frba.dds;

public class Prenda {
  TipoDePrenda tipo;
  Material material;
  Colores colorPrincipal;
  Colores colorSecundario;

  public Prenda(TipoDePrenda tipo, Material material,
                Colores colorPrincipal, Colores colorSecundario) {
    this.validarColorPrincipal(colorPrincipal);
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  public Prenda(TipoDePrenda tipo, Material material, Colores colorPrincipal) {
    this.validarColorPrincipal(colorPrincipal);
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = Colores.NO_DEFINIDO;
  }

  private void validarColorPrincipal(Colores colorPrincipal) {
    if (colorPrincipal == Colores.NO_DEFINIDO) {
      throw new RuntimeException("El color principal no puede ser No definido");
    }
  }

  public TipoDePrenda getTipo() {
    return this.tipo;
  }

  public Material getMaterial() {
    return this.material;
  }

  public Colores getColorPrincipal() {
    return this.colorPrincipal;
  }

  public Colores getColorSecundario() {
    return this.colorSecundario;
  }

}


