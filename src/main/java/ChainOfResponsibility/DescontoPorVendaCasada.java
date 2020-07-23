package ChainOfResponsibility;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto oDescontoProximo;

    public DescontoPorVendaCasada() {
        this.oDescontoProximo = null;
    }

    public DescontoPorVendaCasada(Desconto oDescontoProximo) {
        this.oDescontoProximo = oDescontoProximo;
    }

    @Override
    public double desconto(OrcamentoVO i_oOrcamento) {
        if (aconteceuVendaCasadaEm(i_oOrcamento)) {
            return i_oOrcamento.getValor() * 0.05;
            
        } else if (oDescontoProximo != null) {
            return oDescontoProximo.desconto(i_oOrcamento);
            
        } else {
            throw new RuntimeException("Formato de Desconto não aceito!");
        }
    }

    private boolean aconteceuVendaCasadaEm(OrcamentoVO i_oOrcamento) {
        return existe(Material.CANETA.getDescricao(), i_oOrcamento) && existe(Material.LAPIS.getDescricao(), i_oOrcamento);
    }

    private boolean existe(String nomeItem, OrcamentoVO i_oOrcamento) {
        for (Item item : i_oOrcamento.getvItem()) {
            if (item.getNome().equals(nomeItem)) {
                return true;
            }
        }
        
        return false;
    }

    @Override
    public void setDesconto(Desconto i_oDesconto) {
        this.oDescontoProximo = i_oDesconto;
    }

}
