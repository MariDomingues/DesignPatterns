package Basico;

import Basico.Imposto;
import Basico.OrcamentoVO;

public class ISS extends Imposto {

    public ISS(Imposto oOutroImposto) {
        super(oOutroImposto);
    }

    public ISS() {
    }

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.06;
    }
    
}
