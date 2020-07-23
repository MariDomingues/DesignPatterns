package State;

import Basico.OrcamentoVO;

public class Aprovado implements EstadoOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(OrcamentoVO i_oOrcamento) {
        if (!descontoAplicado) {
            double valor = i_oOrcamento.getValor() - (i_oOrcamento.getValor() * 0.02);
            i_oOrcamento.setValor(valor);
        } else {
            throw new RuntimeException("Desconto j� aplicado!");
        }
    }

    @Override
    public void aprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos j� est� aprovado!");
    }

    @Override
    public void reprovsr(OrcamentoVO i_oOrcamento) {
        throw new RuntimeException("Or�amentos j� aprovado!");
    }

    @Override
    public void finalizar(OrcamentoVO i_oOrcamento) {
        i_oOrcamento.setStatus(new Finalizado());
    }
}
