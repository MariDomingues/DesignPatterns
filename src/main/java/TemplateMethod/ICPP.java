package TemplateMethod;

public class ICPP extends TemplateImpostoCondicional {

    @Override
    protected boolean temMaximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() >= 500;
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
