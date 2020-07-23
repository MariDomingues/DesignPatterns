package Decorator;

import Basico.Imposto;
import Basico.OrcamentoVO;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto oOutroImposto) {
        super(oOutroImposto);
    }

    public ImpostoMuitoAlto() {
        super();
    }

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.2 + proximoImposto(i_oOrcamento);
    }
    
}
