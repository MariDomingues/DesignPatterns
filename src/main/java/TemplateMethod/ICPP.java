package TemplateMethod;

public class ICPP extends TemplateImpostoCondicional {

    @Override
    public boolean temMaximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() > 500;
    }

    @Override
    public double maximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.05;
    }

    @Override
    public double minimaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.07;
    }
}
