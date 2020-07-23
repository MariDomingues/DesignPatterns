package ChainOfResponsibility;

public class Main {
    
    public static void main(String[] args) {
        Desconto oDescontoPorCincoItens = new DescontoPorCincoItens();
        Desconto oDescontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
        Desconto oDescontoPorVendaCasada = new DescontoPorVendaCasada();
        Desconto oSemDesconto = new SemDesconto();
        
        oDescontoPorCincoItens.setDesconto(oDescontoPorMaisDeQuinhentosReais);
        oDescontoPorMaisDeQuinhentosReais.setDesconto(oDescontoPorVendaCasada);
        oDescontoPorVendaCasada.setDesconto(oSemDesconto);
        
        OrcamentoVO oOrcamento = new OrcamentoVO(600);
        oOrcamento.adicionarItem(new Item(Material.CANETA.getDescricao(), Material.CANETA.getPreco()));
        oOrcamento.adicionarItem(new Item(Material.LAPIS.getDescricao(), Material.LAPIS.getPreco()));
        oOrcamento.adicionarItem(new Item(Material.BORRACHA.getDescricao(), Material.BORRACHA.getPreco()));
        
        System.out.println(oDescontoPorCincoItens.desconto(oOrcamento));
    }
}
