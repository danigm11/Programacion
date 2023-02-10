package misFunciones;

public class Geometria {
    /*
	* Devuelve el área de un rectángulo
	*
	* @param b y h base y altura   
	* @return el area
	*/
	
	public static double areaRectangulo(double  b, double h){
		
		return b*h;
	}
     /*
	* Devuelve el perímetro de un rectángulo
	*
	* @param b y h base y altura   
	* @return el perímetro
	*/
	
	public static double perimetroRectangulo(double  b, double h){
		
		return (b+h)*2;
	}
    /*
	* Devuelve la longitud de una circunferencia
	*
	* @param r el radio  
	* @return la longitud
	*/
	
	public static double circunferencia(double r){
		
		return r*2*3.141592;
	}
    /*
	* Devuelve el área de un círculo
	*
	* @param r el radio  
	* @return el area del círculo
	*/
	
	public static double areaCirculo(double r){
		
		return r*r*3.141592;
	}
    /*
	* Devuelve el volumen de una esfera
	*
	* @param r el radio  
	* @return el volumen de la esfera
	*/
	
	public static double voluemEsfera(double r){
		
		return r*r*r*3.141592*4/3;
	}
}
