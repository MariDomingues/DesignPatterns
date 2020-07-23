package State;

import Basico.OrcamentoVO;

public interface EstadoOrcamento {
    
    public void aplicaDescontoExtra(OrcamentoVO i_oOrcamento);
    
    public void aprovsr(OrcamentoVO i_oOrcamento);
    
    public void reprovsr(OrcamentoVO i_oOrcamento);
    
    public void finalizar(OrcamentoVO i_oOrcamento);
}
