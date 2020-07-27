package Observer;

import Builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {

    private double fator;

    public Multiplicador(double i_fator) {
        this.fator = i_fator;
    }
    
    @Override
    public void executa(NotaFiscal oNotaFiscal) {
        System.out.println(oNotaFiscal.getValorBruto() * this.fator);
    }
}
