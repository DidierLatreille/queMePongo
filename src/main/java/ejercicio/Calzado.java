package ejercicio;

public class Calzado extends Prenda{
	private enumCalzado tipo;
	
	public Calzado(enumCalzado esteCalzado, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(esteCalzado == null) {throw new NullPointerException("el tipo de prenda no puede estar vacio");}
		tipo = esteCalzado;
	}
}
