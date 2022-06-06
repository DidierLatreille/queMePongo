package ejercicio;

public class ParteInferior extends Prenda{
	private enumParteInferior tipo;
	
	public ParteInferior(enumParteInferior estaParte, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacio");}
		tipo = estaParte;
	}
}
