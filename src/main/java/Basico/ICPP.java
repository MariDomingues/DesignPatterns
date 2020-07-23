package Basico;

import TemplateMethod.TemplateImpostoCondicional;

public class ICPP extends TemplateImpostoCondicional {

    public ICPP(Imposto impst) {
        super(impst);
    }

    public ICPP() {
    }

    @Override
    protected boolean temMaximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() >= 500 + proximoImposto(i_oOrcamento);
    }

    @Override
    protected double maximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.07;
    }

    @Override
    protected double minimaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.05;
    }
}
