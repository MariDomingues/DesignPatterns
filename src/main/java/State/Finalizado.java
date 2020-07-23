package State;

import Basico.OrcamentoVO;

public class Finalizado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Orçamentos finalizado não recebem desconto extra!");
    }

    @Override
    public void aprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Orçamentos já está finalizado, não é possível aprová-lo!");
    }

    @Override
    public void reprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Orçamentos já está finalizado, não é possível reprová-lo!");
    }

    @Override
    public void finalizar(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Orçamentos já está finalizado!");
    }
}
