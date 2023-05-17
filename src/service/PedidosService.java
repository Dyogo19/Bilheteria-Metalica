package service;

import enums.TipoDeBilhetes;
import model.Bilhete;
import model.Usuario;

import java.time.LocalDate;

public class PedidosService{

    public void efetuarPedido(Bilhete bilhete , Usuario usuario){
        System.out.println("Tipo Bilhete " + bilhete.getTipoDeBilhete() +
                            "Nome Usuario " + usuario.getNome());
    }
}
