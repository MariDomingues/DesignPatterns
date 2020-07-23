package TemplateMethod;

public abstract class TemplateImpostoCondicional implements Imposto {

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        if (temMaximaTaxacao(i_oOrcamento)) {
            return maximaTaxacao(i_oOrcamento);
        } else {
            return minimaTaxacao(i_oOrcamento);
        }
    }

    public abstract boolean temMaximaTaxacao(OrcamentoVO i_oOrcamento);

    public abstract double maximaTaxacao(OrcamentoVO i_oOrcamento);

    public abstract double minimaTaxacao(OrcamentoVO i_oOrcamento);
}
