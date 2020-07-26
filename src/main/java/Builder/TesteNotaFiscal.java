package Builder;

import java.util.Calendar;

public class TesteNotaFiscal {

    public static void main(String[] args) {
        NotaFiscalBuilder oBuilder = new NotaFiscalBuilder();
        oBuilder.empresa("Teste Empresa")
        .cnpj("12.345.678/001-12")
        .itens(new ItemNota("Item 1", 200))
        .itens(new ItemNota("Item 2", 300))
        .itens(new ItemNota("Item 3", 400))
        .observacao("Observação")
        .dataAtual(Calendar.getInstance());

        NotaFiscal oNotaFiscal = oBuilder.constroiNotaFiscal();
        
        System.out.println(oNotaFiscal.getValorBruto());
    }
}
