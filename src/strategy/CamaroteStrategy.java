package strategy;

import enums.TipoDeBilhetes;
import model.Usuario;

import java.math.BigDecimal;

public class CamaroteStrategy implements CalculoValorIngressoStrategy{
    @Override
    public BigDecimal valorIngresso(TipoDeBilhetes tipoDeBilhetes, Usuario usuario) {
        BigDecimal valor = TipoDeBilhetes.CAMAROTE.getValor();
        return valor;
    }

}
