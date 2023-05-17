package strategy;


import enums.TipoDeBilhetes;
import model.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CadeiraSuperiorStrategy implements CalculoValorIngressoStrategy{

    private static final BigDecimal estudante = BigDecimal.valueOf(0.5);
    private static final BigDecimal idoso = BigDecimal.valueOf(0.6);
    private static final long idadeIdoso = 60;

    @Override
    public BigDecimal valorIngresso(TipoDeBilhetes tipoDeBilhetes, Usuario usuario) {
        long idade = ChronoUnit.YEARS.between(usuario.getDataNascimento(), LocalDate.now());
        BigDecimal valor = TipoDeBilhetes.CADEIRASUPERIOR.getValor();

        if (usuario.isEstudante()) {
            if (idade >= idadeIdoso) {
                return valor.subtract(valor.multiply(idoso));
            }
            return valor.subtract(valor.multiply(estudante));
        }
        if (idade >= idadeIdoso) {
            return valor.subtract(valor.multiply(idoso));
        } else {
            return valor;
        }
    }
}
