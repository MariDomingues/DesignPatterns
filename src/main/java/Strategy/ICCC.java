package Strategy;

import Basico.Imposto;
import Basico.OrcamentoVO;

public class ICCC implements Imposto {

    @Override
    public double calcular(OrcamentoVO i_oOrcamento) {
        double resultado = 0;
        
        if (i_oOrcamento.getValor() < 1000 ) {
            resultado = i_oOrcamento.getValor() * 0.05;
            
        } else if (i_oOrcamento.getValor() >= 1000 && i_oOrcamento.getValor() <= 3000) {
            resultado = i_oOrcamento.getValor() * 0.07;
            
        } else if (i_oOrcamento.getValor() > 3000) {
            resultado = i_oOrcamento.getValor() * 0.08 + 30;
        }
        
        return resultado;
    }
}
