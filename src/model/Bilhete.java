package model;

import enums.TipoDeBilhetes;
import strategy.CalculoValorIngressoStrategy;

import java.math.BigDecimal;

public class Bilhete {

    private Integer id;
    private TipoDeBilhetes tipoDeBilhete;
    private Usuario usuario;



    public Bilhete(Integer id, TipoDeBilhetes tipoDeBilhete, Usuario usuario) {
        this.id = id;
        this.tipoDeBilhete = tipoDeBilhete;
        this.usuario = usuario;

    }

    public double getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoDeBilhetes getTipoDeBilhete() {
        return tipoDeBilhete;
    }

    public void setTipoDeBilhete(TipoDeBilhetes tipoDeBilhete) {
        this.tipoDeBilhete = tipoDeBilhete;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Bilhete{" +
                "id = " + id +
                ", tipoDeBilhete = " + tipoDeBilhete +
                ", usuario = " + usuario.getNome() +
                '}';
    }
}

