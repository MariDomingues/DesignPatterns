package TemplateMethod;

public class ISS implements Imposto {

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        return i_oOrcamento.getValor() * 0.06;
    }
    
}
