package Decorator;

import Basico.ICMS;
import Basico.Imposto;
import Basico.OrcamentoVO;

public class TesteImpostoComplexo {
    
    public static void main(String[] args) {
        OrcamentoVO oOrcamento = new OrcamentoVO(500);
        Imposto oImpostos = new ImpostoMuitoAlto(new ICMS());
        
        System.out.println(oImpostos.calcular(oOrcamento));
    }
}