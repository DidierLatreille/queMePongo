package ejercicio;

public class Atuendo {
	private Accesorio accesorio;
	private ParteSuperior parteSuperior;
	private ParteInferior parteInferior;
	private Calzado calzado;
	
	public Atuendo(Accesorio newAcce, ParteSuperior newParteSup, ParteInferior newParteInf, Calzado newCalza) {
		accesorio = newAcce;
		
		if(newParteSup == null) {throw new NullPointerException("La parte sup no puede quedar vacia");}
		parteSuperior = newParteSup;
		
		if(newParteInf == null) {throw new NullPointerException("La parte inf no puede quedar vacia");}
		parteInferior = newParteInf;
		
		if(newCalza == null) {throw new NullPointerException("El calzado no puede quedar vacio");}
		calzado = newCalza; 
	}
}
