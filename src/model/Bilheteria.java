package model;

import enums.TipoDeBilhetes;
import strategy.CalculoValorIngressoStrategy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Bilheteria {

    public BigDecimal calculo(TipoDeBilhetes tipoDeBilhetes , Usuario usuario){
        CalculoValorIngressoStrategy estragiaCalculo = tipoDeBilhetes.getStrategy();
        return estragiaCalculo.valorIngresso(tipoDeBilhetes, usuario);
    }


}
