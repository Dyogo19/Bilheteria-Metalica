package strategy;

import enums.TipoDeBilhetes;
import model.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PistaStrategy implements CalculoValorIngressoStrategy {

    private static final BigDecimal estudanteAndIdoso = BigDecimal.valueOf(0.5);
    private static final long idadeIdoso = 60;

    @Override
    public BigDecimal valorIngresso(TipoDeBilhetes tipoDeBilhetes, Usuario usuario) {
        long idade = ChronoUnit.YEARS.between(usuario.getDataNascimento(), LocalDate.now());
        BigDecimal valor = TipoDeBilhetes.PISTA.getValor();

        if (usuario.isEstudante() || idade >= idadeIdoso) {
            return valor.subtract(valor.multiply(estudanteAndIdoso));
        } else
            return valor;
    }
}


