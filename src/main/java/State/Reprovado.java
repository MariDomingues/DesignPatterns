package State;

import Basico.OrcamentoVO;

public class Reprovado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
    }

    @Override
    public void aprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Orçamentos já está reprovado, não é possível ser aprovado!");
    }

    @Override
    public void reprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Orçamentos já está reprovado!");
    }

    @Override
    public void finalizar(OrcamentoVO i_oOrcamento) {
        i_oOrcamento.setStatus(new Finalizado() );
    }
}
