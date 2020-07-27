package Observer;

import Builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {
    
    public void executa(NotaFiscal oNotaFiscal) {
        System.out.println("Nota Impressa");
    }
}
