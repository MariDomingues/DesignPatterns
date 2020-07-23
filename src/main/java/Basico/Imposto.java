package Basico;

public abstract class Imposto {
    
    protected Imposto oOutroImposto;

    public Imposto(Imposto oOutroImposto) {
        this.oOutroImposto = oOutroImposto;
    }

    public Imposto() {
    }
    
    public abstract double calcular(OrcamentoVO i_oOrcamento);
}
