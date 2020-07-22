package ChainOfResponsibility;

public class Main {
    
    public static void main(String[] args) {
        CalculadoraDesconto oCalculadoradescontos = new CalculadoraDesconto();
        
        OrcamentoVO oOrcamento = new OrcamentoVO(600);
        oOrcamento.adicionarItem(new Item("Caneta", 250));
        oOrcamento.adicionarItem(new Item("Lápis", 250));
        
        System.out.println(oCalculadoradescontos.calcula(oOrcamento));
    }
}
