package Observer;

import Builder.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota {
    
    public void executa(NotaFiscal oNotaFiscal) {
        System.out.println("Salvei no banco");
    }
}
