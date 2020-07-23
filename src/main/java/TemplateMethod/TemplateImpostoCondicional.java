package TemplateMethod;

public abstract class TemplateImpostoCondicional implements Imposto {

    @Override
    public final double calcular(OrcamentoVO i_oOrcamento) {
        if (temMaximaTaxacao(i_oOrcamento)) {
            return maximaTaxacao(i_oOrcamento);
        } else {
            return minimaTaxacao(i_oOrcamento);
        }
    }

    protected abstract boolean temMaximaTaxacao(OrcamentoVO i_oOrcamento);

    protected abstract double maximaTaxacao(OrcamentoVO i_oOrcamento);

    protected abstract double minimaTaxacao(OrcamentoVO i_oOrcamento);
}