import enums.TipoDeBilhetes;
import model.Bilhete;
import model.Bilheteria;
import model.Usuario;
import service.PedidosService;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {

        Bilheteria bilheteria = new Bilheteria();

        Usuario usuario = new Usuario("Dyto" , LocalDate.of(2005 , 5 , 19) , true);

        Bilhete bilhete = new Bilhete(1 , TipoDeBilhetes.CADEIRAINFERIOR , usuario);
        Bilhete bilhete2 = new Bilhete(2 , TipoDeBilhetes.PISTAPREMIUM , usuario);
        Bilhete bilhete3 = new Bilhete(3 , TipoDeBilhetes.CAMAROTE , usuario);

        System.out.println(bilhete + " Valor = " + bilheteria.calculo(TipoDeBilhetes.CADEIRAINFERIOR , usuario));
        System.out.println(bilhete2 + " Valor = " + bilheteria.calculo(TipoDeBilhetes.PISTAPREMIUM , usuario));
        System.out.println(bilhete3 + " Valor = " + bilheteria.calculo(TipoDeBilhetes.CAMAROTE , usuario));


    }
}
