package Basico;

public abstract class Imposto {
    
    private final Imposto oOutroImposto;

    public Imposto(Imposto oOutroImposto) {
        this.oOutroImposto = oOutroImposto;
    }

    public Imposto() {
        oOutroImposto = null;
    }
    
    public abstract double calcular(OrcamentoVO i_oOrcamento);
    
    protected double proximoImposto(OrcamentoVO i_oOrcamento) {
        if (oOutroImposto == null) {
            return 0;
        }
        
        return oOutroImposto.calcular(i_oOrcamento);
    }
}
