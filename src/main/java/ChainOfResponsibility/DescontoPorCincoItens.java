package ChainOfResponsibility;

public class DescontoPorCincoItens implements Desconto {
    
    private Desconto oDesconto;
    
    @Override
    public double desconto(OrcamentoVO i_oOrcamento) {
        if (i_oOrcamento.getvItem().size() > 5) {
            return i_oOrcamento.getValor() * 0.1;
        } else {
            return oDesconto.desconto(i_oOrcamento);
        }
    }

    @Override
    public void setDesconto(Desconto i_oDesconto) {
        this.oDesconto = i_oDesconto;
    }
}
