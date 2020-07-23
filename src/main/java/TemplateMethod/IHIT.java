package TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional {

    @Override
    protected boolean temMaximaTaxacao(OrcamentoVO i_oOrcamento) {
        return existe(i_oOrcamento);
    }

    @Override
    protected double maximaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected double minimaTaxacao(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() + (i_oOrcamento.getvItem().size() * 0.01);
    }
    
    private boolean existe(OrcamentoVO i_oOrcamento) {
        List<String> vProduto = new ArrayList<>();
        
        for (Item oItem : i_oOrcamento.getvItem()) {
            if (vProduto.contains(oItem.getNome())) {
                return true;
            } else {
                vProduto.add(oItem.getNome());
            }
        }
        
        return false;
    }
}
