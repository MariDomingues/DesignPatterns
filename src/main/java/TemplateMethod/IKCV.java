package TemplateMethod;

public class IKCV extends TemplateImpostoCondicional {

    @Override
    public boolean temMaximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() > 500 && valorItemMaiorQueCem(i_oOrcamento);
    }

    @Override
    public double maximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.1;
    }

    @Override
    public double minimaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.06;
    }

    private boolean valorItemMaiorQueCem(OrcamentoVO i_oOrcamento) {
        for (Item oItem : i_oOrcamento.getvItem()) {
            if (oItem.getValor() > 100) {
               return true;
            }
        }

        return false;
    }
}
