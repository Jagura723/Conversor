import javax.swing.JOptionPane;

public class ConversorDivisaApesos {

	
	String ConversorDivisas = (JOptionPane.showInputDialog(null,
			"Seleccione una divisa","Conversor de divisas",
			JOptionPane.PLAIN_MESSAGE,null,
			new Object[] {"Pesos Mx de Dolar",
			"Pesos Mx a Euro", "Pesos Mx a Libras esterlinas", "Pesos Mx a Won Surcoreano", "Dolar a Pesos Mx", "Euro a Pesos Mx", "libras esterlinas a Pesos Mx", "Won Surcoreano a Pesos MX"}, 
			"Selecciona")).toString();
	String ConversorTemperaturas = (JOptionPane.showInputDialog(null,
			"Seleccione una divisa","Conversor de divisas",
			JOptionPane.PLAIN_MESSAGE,null,
			new Object[] {"Celcius a Fahrenheit","Celcius a Kelvin","Celcius a Reaumur","Celcius a Rankine",
			}, 
			"Selecciona")).toString();
			break;
	
	
}
