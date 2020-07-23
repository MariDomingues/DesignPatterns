package Basico;

public class ICMS extends Imposto {

    public ICMS(Imposto oOutroImposto) {
        super(oOutroImposto);
    }

    public ICMS() {
        super();
    }

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.05 + 50 + proximoImposto(i_oOrcamento);
    }
}
