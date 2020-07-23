package Decorator;

import Basico.ISS;
import Basico.Imposto;
import Basico.OrcamentoVO;

public class TesteImpostoComplexo {
    
    public static void main(String[] args) {
        OrcamentoVO oOrcamento = new OrcamentoVO(500);
        Imposto oIss = new ISS();
        
        System.out.println(oIss.calcular(oOrcamento));
    }
}