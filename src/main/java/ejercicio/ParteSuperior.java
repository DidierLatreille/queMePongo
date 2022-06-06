package ejercicio;

public class ParteSuperior extends Prenda {
	private enumParteSuperior tipo;
	
	public ParteSuperior(enumParteSuperior estaParte, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacio");}
		tipo = estaParte;
	}

}