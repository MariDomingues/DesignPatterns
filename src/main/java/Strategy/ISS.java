package Strategy;

import Basico.Imposto;
import Basico.OrcamentoVO;

public class ISS implements Imposto {

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.06;
    }
    
}
