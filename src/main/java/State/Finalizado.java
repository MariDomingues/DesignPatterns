package State;

import Basico.OrcamentoVO;

public class Finalizado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos finalizado n�o recebem desconto extra!");
    }

    @Override
    public void aprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos j� est� finalizado, n�o � poss�vel aprov�-lo!");
    }

    @Override
    public void reprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos j� est� finalizado, n�o � poss�vel reprov�-lo!");
    }

    @Override
    public void finalizar(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos j� est� finalizado!");
    }
}
