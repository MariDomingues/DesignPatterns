package ChainOfResponsibility;

public class SemDesconto implements Desconto {

    @Override
    public double desconto(OrcamentoVO i_oOrcamento) {
        return 0;
    }

    @Override
    public void setDesconto(Desconto i_oDesconto) {
    }
    
}
