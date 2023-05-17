package enums;

import strategy.*;

import java.math.BigDecimal;

public enum TipoDeBilhetes {

    PISTA(new BigDecimal(250),new PistaStrategy()),
    PISTAPREMIUM(new BigDecimal(400) ,new PistaPremiumStrategy()),
    CAMAROTE(new BigDecimal(750) ,new CamaroteStrategy()),
    CADEIRAINFERIOR(new BigDecimal(200) , new CadeiraInferiorStrategy()),
    CADEIRASUPERIOR(new BigDecimal(150) ,new CadeiraSuperiorStrategy());

    private final CalculoValorIngressoStrategy strategy;
    private final BigDecimal valor;
    private TipoDeBilhetes(BigDecimal valor , CalculoValorIngressoStrategy strategy){
        this.valor = valor;
        this.strategy = strategy;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public CalculoValorIngressoStrategy getStrategy(){
        return strategy;
    }


}
