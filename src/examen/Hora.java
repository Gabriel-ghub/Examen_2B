package examen;
/**
 * Clase Hora
 * @version 1.0
 * @author DAW111
 * */
public class Hora {
	/**
	 * Atributo boolean horaValida, es lo que devolverá al final del método
	 * */
	public static boolean horaValida;
/**
 * Metodo que recibe valor de hora, segundos y minutos
 * @param segundos Hace referencia a los segundos
 * @param minutos Hace referencia a los minutos
 * @param horas Hace referencia a las horas
 * @return Retorna true o false dependiendo de que cumpla con las condiciones
 * */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}
