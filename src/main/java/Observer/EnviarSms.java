package Observer;

import Builder.NotaFiscal;

public class EnviarSms implements AcaoAposGerarNota {
    
    public void executa(NotaFiscal oNotaFiscal) {
        System.out.println("Enviei por SMS");
    }
}
