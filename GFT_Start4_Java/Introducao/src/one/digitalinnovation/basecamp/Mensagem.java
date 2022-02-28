package one.digitalinnovation.basecamp;

import java.util.Calendar;
import java.util.Date;

public class Mensagem{

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);

        Date data = new Date();

    if(hora > 6 && hora < 12){
        System.out.println(data+" > - > - > - | *** Bom Dia !");
        }
        else if(hora > 12 && hora < 18){
            System.out.println(data+" > - > - > - | *** Boa Tarde !");
        }
        else{
            System.out.println(data+" > - > - > - | *** Boa Noite !");
		}
	}
}