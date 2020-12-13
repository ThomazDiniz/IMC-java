
public class IMCModel {

	public static double imc(double altura, double peso) {
		return peso/(altura*altura);
	}
	
	public static String imcResult(double altura, double peso) {
		double result = imc(altura, peso);
		return imcString(result);
	}
	
	public static String imcString(double imc) {
		if (imc < 17)
			return "Muito Abaixo do Peso";
		if (imc < 24.99)
			return "Peso Ideal";
		if (imc < 29.99)
			return "Acima do Peso";
		if (imc < 34.99)
			return "Obesidade I";
		if (imc < 39.99)
			return "Obesidade II - Sevéra";
		
			
		return "Obesidade III - Mórbida";
	}
	
}
