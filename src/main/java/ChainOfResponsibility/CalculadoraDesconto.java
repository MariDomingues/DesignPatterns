package ChainOfResponsibility;

public class CalculadoraDesconto {
    
    public double calcula(OrcamentoVO i_oOrcamento) {
        Desconto oDescontoPorCincoItens = new DescontoPorCincoItens();
        Desconto oDescontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
        Desconto oSemDesconto = new SemDesconto();
        
        oDescontoPorCincoItens.setDesconto(oDescontoPorMaisDeQuinhentosReais);
        oDescontoPorMaisDeQuinhentosReais.setDesconto(oSemDesconto);
        
        return oDescontoPorCincoItens.desconto(i_oOrcamento);
    }
}
