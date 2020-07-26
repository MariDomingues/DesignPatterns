package Builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private Calendar dataEmissao;
    private double valorBruto;
    private double imposto;
    public List<ItemNota> vItem;
    public String observacao;

    public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, 
            double valorBruto, double imposto, List<ItemNota> vItem, String observacao) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmissao = dataEmissao;
        this.valorBruto = valorBruto;
        this.imposto = imposto;
        this.vItem = vItem;
        this.observacao = observacao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImposto() {
        return imposto;
    }
}
