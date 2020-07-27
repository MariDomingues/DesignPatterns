package Observer;

import Builder.NotaFiscal;

public class EnviarEmail implements AcaoAposGerarNota {
    
    public void executa(NotaFiscal oNotaFiscal) {
        System.out.println("Enviei por Email");
    }
}
