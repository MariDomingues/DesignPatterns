package TemplateMethod;

import Basico.ICCC;
import Basico.ICMS;
import Basico.ISS;
import Basico.OrcamentoVO;

public class Main {

    public static void main(String[] args) {
        OrcamentoVO oOrcamento = new OrcamentoVO(100);
        
        ICMS oIcms = new ICMS();
        ISS oIss = new ISS();
        ICCC oIccc = new ICCC();
        
        CalculadoraImposto oCalculadora = new CalculadoraImposto();
        oCalculadora.calcular(oOrcamento, oIcms);
        oCalculadora.calcular(oOrcamento, oIss);
        
        oOrcamento = new OrcamentoVO(950);
        oCalculadora.calcular(oOrcamento, oIccc);
        
        oOrcamento = new OrcamentoVO(2000);
        oCalculadora.calcular(oOrcamento, oIccc);
        
        oOrcamento = new OrcamentoVO(3001);
        oCalculadora.calcular(oOrcamento, oIccc);
    }
}
