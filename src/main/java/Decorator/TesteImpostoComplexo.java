package Decorator;

import Basico.Imposto;
import Basico.OrcamentoVO;
import TemplateMethod.ISS;

public class TesteImpostoComplexo {
    
    public static void main(String[] args) {
        Imposto oIss = new ISS();
        
        OrcamentoVO oOrcamento = new OrcamentoVO(600);
    }
}