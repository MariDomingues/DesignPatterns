package ChainOfResponsibility;

import Basico.OrcamentoVO;

public class DescontoPorCincoItens implements Desconto {
    
    private Desconto oDescontoProximo;

    public DescontoPorCincoItens() {
        this.oDescontoProximo = null;
    }

    public DescontoPorCincoItens(Desconto oDescontoProximo) {
        this.oDescontoProximo = oDescontoProximo;
    }
    
    @Override
    public double desconto(OrcamentoVO i_oOrcamento) {
        if (i_oOrcamento.getvItem().size() > 5) {
            return i_oOrcamento.getValor() * 0.1;
        } else if (oDescontoProximo != null) {
            return oDescontoProximo.desconto(i_oOrcamento);
            
        } else {
            throw new RuntimeException("Formato de Desconto não aceito!");
        }
    }

    @Override
    public void setDesconto(Desconto i_oDesconto) {
        this.oDescontoProximo = i_oDesconto;
    }
}
