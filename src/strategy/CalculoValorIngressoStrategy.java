package strategy;


import enums.TipoDeBilhetes;
import model.Usuario;

import java.math.BigDecimal;

public interface CalculoValorIngressoStrategy {


    BigDecimal valorIngresso(TipoDeBilhetes tipoDeBilhetes , Usuario usuario);

}