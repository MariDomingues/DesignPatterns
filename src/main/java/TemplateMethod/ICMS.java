package TemplateMethod;

import Basico.Imposto;
import Basico.OrcamentoVO;

public class ICMS implements Imposto {

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.05 + 50;
    }
}
