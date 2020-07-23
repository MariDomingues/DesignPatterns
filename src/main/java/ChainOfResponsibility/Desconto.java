package ChainOfResponsibility;

import Basico.OrcamentoVO;

public interface Desconto {
    
    public double desconto(OrcamentoVO i_oOrcamento);
    
    public void setDesconto(Desconto i_oDesconto);
}
