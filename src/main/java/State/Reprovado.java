package State;

import Basico.OrcamentoVO;

public class Reprovado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
    }

    @Override
    public void aprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos j� est� reprovado, n�o � poss�vel ser aprovado!");
    }

    @Override
    public void reprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos j� est� reprovado!");
    }

    @Override
    public void finalizar(OrcamentoVO i_oOrcamento) {
        i_oOrcamento.setStatus(new Finalizado() );
    }
}
