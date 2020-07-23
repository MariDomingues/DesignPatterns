package Basico;

import Basico.Imposto;
import Basico.OrcamentoVO;

public class ICMS extends Imposto {

    public ICMS(Imposto oOutroImposto) {
        super(oOutroImposto);
    }

    public ICMS() {
    }

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.05 + 50;
    }
}
