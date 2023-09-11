/*=====================================================================================================================
  CalculadoraTesteJunit - 2023-08-31 - FELIPE PEDROSO DE LIMA
=====================================================================================================================*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTesteJunit {
    Calculadora calc =  new Calculadora();

    @Test
    public void SomarDoisValoresPositivosInteiro() {
        assertEquals(10,this.calc.somar(7,3)); //Teste OK!
        assertEquals(0,this.calc.somar(0,0));  //Teste OK!
        assertEquals(2147483648,this.calc.somar(Integer.MAX_VALUE, 1)); // Erro! Número muito longo para suportar dentro do inteiro.
    }

    @Test
    public void SomarDoisValoresPositivoNegativoInteiro() {
        assertEquals(-1,this.calc.somar(1, -2)); //Teste OK!
        assertEquals(1,this.calc.somar(-1, 2));  //Teste OK!
    }

    @Test
    public void SomarDoisValoresDoubleInteiroPositivo(){
        assertEquals(6.5,this.calc.somar(5.5,1));
        // Teste não OK! Tipo incompatíveis no método
    }

    @Test
    public void SomarDoisValoresCharInteiroPositivo(){
        assertEquals(6.5,this.calc.somar('a',1));
        // Teste não OK! Tipo incompatíveis no método
    }

    @Test
    public void SubtrairDoisValoresPositivosInteiro() {
        assertEquals(4,this.calc.subtrair(7,3)); //Teste OK!
        assertEquals(0,this.calc.subtrair(0,0));  //Teste OK!
        assertEquals(2147483646,this.calc.subtrair(Integer.MAX_VALUE, 1)); //Teste OK!
    }

    @Test
    public void SubtrairDoisValoresPositivoNegativoInteiro() {
        assertEquals(3,this.calc.subtrair(1, -2)); //Teste OK!
        assertEquals(-3,this.calc.subtrair(-1, 2));  //Teste OK!
    }

    @Test
    public void SubtrairDoisValoresDoubleInteiroPositivo(){
        assertEquals(4.5,this.calc.subtrair(5.5,1));
        // Teste não OK! Tipo incompatíveis no método
    }

    @Test
    public void SubtrairDoisValoresCharInteiroPositivo(){
        assertEquals(6.5,this.calc.subtrair('a',1));
        // Teste não OK! Tipo incompatíveis no método
    }

    @Test
    public void MultiplicarDoisValoresPositivos() {
        assertEquals(2,this.calc.multiplicar(1,2)); //Teste OK!
        assertEquals(0,this.calc.multiplicar(0,0)); //Teste OK!
        assertEquals(9.5,this.calc.multiplicar(2.50,3.80)); //Teste OK!
    }

    @Test
    public void MultiplicarDoisValoresNegativosPositivos() {
        assertEquals(-2,this.calc.multiplicar(1,-2)); //Teste OK!
    }

    @Test
    public void DividirDoisValoresPositivos() {
        assertEquals(0.5,this.calc.dividir(1,2)); //Teste OK!
        assertEquals(0,this.calc.dividir(0,0)); // NaN
        assertEquals(0.65,this.calc.dividir(2.50,3.80)); //Teste OK!
    }

    @Test
    public void DividirDoisValoresNegativosPositivos() {
        assertEquals(-0.5,this.calc.dividir(1,-2)); //Teste OK!
    }
}
