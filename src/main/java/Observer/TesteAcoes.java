package Observer;

import Builder.ItemNota;
import Builder.NotaFiscal;
import Builder.NotaFiscalBuilder;
import java.util.Calendar;

public class TesteAcoes {
    
    public static void main(String[] args) {
        NotaFiscalBuilder oBuilder = new NotaFiscalBuilder();
        oBuilder.adicionaAcao(new EnviarEmail());
        oBuilder.adicionaAcao(new NotaFiscalDAO());
        oBuilder.adicionaAcao(new EnviarSms());
        oBuilder.adicionaAcao(new Impressora());
        oBuilder.adicionaAcao(new Multiplicador(2));
        oBuilder.adicionaAcao(new Multiplicador(3));
        oBuilder.adicionaAcao(new Multiplicador(5.5));
        
        NotaFiscal oNotaFiscal = oBuilder.empresa("Teste Empresa")
                .cnpj("12.345.678/001-12")
                .itens(new ItemNota("Item 1", 200))
                .itens(new ItemNota("Item 2", 300))
                .itens(new ItemNota("Item 3", 400))
                .observacao("Observação")
                .dataAtual(Calendar.getInstance())
                .constroiNotaFiscal();
        
        System.out.println(oNotaFiscal.getValorBruto());
    }
}
