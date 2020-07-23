package Basico;

public class ISS extends Imposto {

    public ISS(Imposto oOutroImposto) {
        super(oOutroImposto);
    }

    public ISS() {
        super();
    }

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.06 + proximoImposto(i_oOrcamento);
    }
}
