package Strategy;

public class CalculadoraImposto {
    
    public void calcular(OrcamentoVO i_oOrcamento, Imposto i_oImposto) {
        System.out.println(i_oImposto.calcular(i_oOrcamento));
    }
}
