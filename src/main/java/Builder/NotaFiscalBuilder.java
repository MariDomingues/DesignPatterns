package Builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemNota> vItem = new ArrayList<>();
    private double valorBruto;
    private double imposto;
    private String observacao;
    private Calendar data;
    
    public NotaFiscalBuilder empresa(String i_razaoSocial) {
        this.razaoSocial = i_razaoSocial;
        return this;
    }
    
    public NotaFiscalBuilder cnpj(String i_cnpj) {
        this.cnpj = i_cnpj;
        return this;
    }
    
    public NotaFiscalBuilder itens(ItemNota i_oItem) {
        vItem.add(i_oItem);
        valorBruto += i_oItem.getValor();
        imposto += i_oItem.getValor() * 0.05;
        return this;
    }
    
    public NotaFiscalBuilder observacao(String i_observacao) {
        this.observacao = i_observacao;
        return this;
    }
    
    public NotaFiscalBuilder dataAtual(Calendar i_data) {
        this.data = i_data;
        return this;
    }
    
    public NotaFiscal constroiNotaFiscal() {
        return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, vItem, observacao);
    }
}
