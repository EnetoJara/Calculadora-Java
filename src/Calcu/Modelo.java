package Calcu;
/**
 * 
 * @author Ernesto Jara Olveda
 *
 */
public class Modelo {
	/**
	 * Este metodo suma los dos valores y retorna la suma
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double sumar(double num1, double num2)
	{
		return num1+num2;
	}
	/**
	 * retorna la resta de los dos valores
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double restar(double num1, double num2)
	{
		return num1-num2;
	}
	/**
	 * returna na multiplicacion de los dos valores
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double multiplicar(double num1, double num2)
	{
		return num1*num2;
	}
	/**
	 * retorna el resultado de la divicion de los dos numeros
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double dividir(double num1, double num2)
	{
		try
		{
			return num1/num2;
		}catch(Exception ex)
		{
			return 0;
		}
	}
	/**
	 * se retorna el numero pero en negativo
	 * @param num
	 * @return
	 */
	public double negativo(double num)
	{
		return num*-1;
	}
	/**
	 * retorna el valor del la operacion realizada
	 * @param num
	 * @param exponenete
	 * @return
	 */
	public double exponenete(double num, double exponenete)
	{
		double aux=num;
		/**
		 * multiplica el numero por si mismo el numero de veces que lo dictamine la variable i
		 */
		for (int i = 1; i < exponenete; i++) {
			num = num*aux;
		}
		return num;
	}
}
