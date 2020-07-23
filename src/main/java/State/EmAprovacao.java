package State;

import Basico.OrcamentoVO;

public class EmAprovacao implements EstadoOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(OrcamentoVO i_oOrcamento) {
        if (!descontoAplicado) {
            double valor = i_oOrcamento.getValor() - (i_oOrcamento.getValor() * 0.05);
            i_oOrcamento.setValor(valor);
        } else {
            throw new RuntimeException("Desconto j� aplicado!");
        }
    }

    @Override
    public void aprovsr(OrcamentoVO i_oOrcamento) {
        i_oOrcamento.setStatus(new Aprovado());
    }

    @Override
    public void reprovsr(OrcamentoVO i_oOrcamento) {
        i_oOrcamento.setStatus(new Reprovado());
    }

    @Override
    public void finalizar(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos em aprova��o n�o podem ir direto para finalizado!");
    }
}
