package ChainOfResponsibility;

import Basico.OrcamentoVO;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
    
    private Desconto oDescontoProximo;

    public DescontoPorMaisDeQuinhentosReais() {
        this.oDescontoProximo = null;
    }

    public DescontoPorMaisDeQuinhentosReais(Desconto oDescontoProximo) {
        this.oDescontoProximo = oDescontoProximo;
    }
    
    @Override
    public double desconto(OrcamentoVO i_oOrcamento) {
        if (i_oOrcamento.getValor() > 500) {
            return i_oOrcamento.getValor() * 0.07;
            
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
