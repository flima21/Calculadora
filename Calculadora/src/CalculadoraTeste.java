
/*=====================================================================================================================
  Calculadora - 2023-08-31 - FELIPE PEDROSO DE LIMA
=====================================================================================================================*/
public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("*---------------------- CENÁRIOS DE TESTE PARA O MÉTODO DE SOMA --------------------------- *");
        /*---------------------- CENÁRIOS DE TESTE PARA O MÉTODO DE SOMA --------------------------- */
        // 1) Teste do método soma: Dois valores inteiros positivos
        System.out.println(calc.somar(1, 2));

        // 2) Teste do método soma: Dois valores inteiros,sendo o primeiro positivo, segundo negativo
        System.out.println(calc.somar(1, -2));

        // 3) Teste do método soma: Dois valores inteiros, sendo o primeiro negativo, segundo positivo
        System.out.println(calc.somar(-1, 2));

        // 4) Teste do método soma: Dois valores zerados
        System.out.println(calc.somar(0, 0));

        // 5) Teste do método soma: Dois valores positivos, sendo o primeiro de tipagem float e o segundo inteiro
        // System.out.println(calc.somar(5.5,1));

        // 6) Teste do método soma: Um valor positivo inteiro e um caracter
        // System.out.println(calc.somar('a',1));

        // 7) Teste do método soma: Um valor positivo inteiro e um caracter
        System.out.println(calc.somar(Integer.MAX_VALUE, 1));
		/*  DESCRIÇÃO DOS CENÁRIOS
			
			1) O cenário se apresentou eficiente e retornou o valor esperado, 3.
			2) O cenário se apresentou eficiente e retornou o valor esperado,-1.
			3) O cenário se apresentou eficiente e retornou o valor esperado, 1.
			4) O cenário se apresentou eficiente e retornou o valor esperado, 0.
			5) O cenário se apresentou não eficiente, visto que o método soma foi previsto para receber dois número de tipo INT e ao passar um float, double ou long, ele apresentou um erro,
			seria interessante os métodos serem trabalhados para verificar os tipos e conseguir receber de todas as formas os números
			6) O cenário se apresentou não eficiente, visto que o método soma foi previsto para receber dois número de tipo INT e ao passar um float, double ou long, ele apresentou um erro.
			7) O cenário não apresentou erros (Crashar a aplicação), todavia, apresentou um overflow, ou seja, excedeu a capacidade maxima do tipo int ao ser acrescentado + 1 e retornou o valor minimo possível representado.
			
			CENÁRIOS 1, 2, 3, 4 TIVERAM ÊXITO;
			CENÁRIOS 5 E 6 TIVERAM UM CRASH DA APLICAÇÃO;
			CENÁRIO 7 NÃO CRASHOU, MAS APRESENTOU OVERFLOW (EXCESSO DO LIMITE)
		*/

        System.out.println("*---------------------- CENÁRIOS DE TESTE PARA O MÉTODO DE SUBTRAIR --------------------------- *");
        /*---------------------- CENÁRIOS DE TESTE PARA O MÉTODO DE SUBTRAIR --------------------------- */
        // 1) Teste do método subtrair: Dois valores inteiros positivos
        System.out.println(calc.subtrair(1, 2));

        // 2) Teste do método subtrair: Dois valores inteiros,sendo o primeiro positivo, segundo negativo
        System.out.println(calc.subtrair(1, -2));

        // 3) Teste do método subtrair: Dois valores inteiros, sendo o primeiro negativo, segundo positivo
        System.out.println(calc.subtrair(-1, 2));

        // 4) Teste do método subtrair: Dois valores zerados
        System.out.println(calc.subtrair(0, 0));

        // 5) Teste do método subtrair: Dois valores positivos, sendo o primeiro de tipagem float e o segundo inteiro
        // System.out.println(calc.subtrair(5.5,1));

        // 6) Teste do método subtrair: Um valor positivo inteiro e um caracter
        // System.out.println(calc.subtrair('a',1));

        // 7) Teste do método subtrair: Um valor positivo inteiro e um caracter
        System.out.println(calc.subtrair(Integer.MAX_VALUE, 1));
        /*  DESCRIÇÃO DOS CENÁRIOS

            1) O cenário se apresentou eficiente e retornou o valor esperado, 1.
            2) O cenário se apresentou eficiente e retornou o valor esperado,-1.
            3) O cenário se apresentou eficiente e retornou o valor esperado,-3.
            4) O cenário se apresentou eficiente e retornou o valor esperado, 0.
            5) O cenário se apresentou não eficiente, visto que o método subtrair foi previsto para receber dois número de tipo INT e ao passar um float, double ou long, ele apresentou um erro,
            seria interessante os métodos serem trabalhados para verificar os tipos e conseguir receber de todas as formas os números
            6) O cenário se apresentou não eficiente, visto que o método subtrair foi previsto para receber dois número de tipo INT e ao passar um float, char,double ou long, ele apresentou um erro.
            7) O cenário não apresentou erros (Crashar a aplicação), todavia, apresentou um overflow, ou seja, excedeu a capacidade maxima do tipo int ao ser acrescentado + 1 e retornou o valor minimo possível representado.

            CENÁRIOS 1, 2, 3, 4 TIVERAM ÊXITO;
            CENÁRIOS 5 E 6 TIVERAM UM CRASH DA APLICAÇÃO;
            CENÁRIO 7 NÃO CRASHOU, MAS APRESENTOU OVERFLOW (EXCESSO DO LIMITE)
        */

        System.out.println("*---------------------- CENÁRIOS DE TESTE PARA O MÉTODO DE MULTIPLICAR --------------------------- *");

        // 1) Teste do método multiplicar: Dois valores inteiros positivos
        System.out.println(calc.multiplicar(1, 2));

        // 2) Teste do método multiplicar: Dois valores inteiros,sendo o primeiro positivo, segundo negativo
        System.out.println(calc.multiplicar(1, -2));

        // 3) Teste do método multiplicar: Dois valores inteiros, sendo o primeiro negativo, segundo positivo
        System.out.println(calc.multiplicar(-1, 2));

        // 4) Teste do método multiplicar: Dois valores zerados
        System.out.println(calc.multiplicar(0, 0));

        // 5) Teste do método multiplicar: Dois valores positivos, sendo o primeiro de tipagem float e o segundo inteiro
        System.out.println(calc.multiplicar(5.5,1));

        // 6) Teste do método multiplicar: Um valor positivo inteiro e um caracter
        // System.out.println(calc.multiplicar('a',1));

        // 7) Teste do método multiplicar: Um valor positivo inteiro e um caracter
        System.out.println(calc.multiplicar(Integer.MAX_VALUE, 1));

        // 8) Teste de método multiplicar: Valores double
        System.out.println(calc.multiplicar(2.50,3.80));

        // 9) Teste de método multiplicar: Valores double MÁXIMOS
        System.out.println(calc.multiplicar(Double.MAX_VALUE,Double.MAX_VALUE));

        /*  DESCRIÇÃO DOS CENÁRIOS

            1) O cenário se apresentou eficiente e retornou o valor esperado, 2.0.
            2) O cenário se apresentou eficiente e retornou o valor esperado,-2.0.
            3) O cenário se apresentou eficiente e retornou o valor esperado,-2.0.
	    3) O cenário se apresentou eficiente e retornou o valor esperado, 0.
            5) O cenário se apresentou eficiente e retornou o valor esperado, 5.5
            6) O cenário se apresentou não eficiente, visto que o método subtrair foi previsto para receber dois número de tipo INT e ao passar um float, double ou long, char, ele apresentou um erro.
            7) O cenário se apresentou eficiente e retornou o valor esperado, 2147483647.
            8) O cenário se apresentou eficiente e retornou o valor esperado, 9.5.
            9) Infinity

            CENÁRIOS 1, 2, 3, 4,5,7,8 TIVERAM ÊXITO;
            CENÁRIOS 6 CRASHOU;
	    CENÁRIO 9 OVERFLOW;
        */

        System.out.println("*---------------------- CENÁRIOS DE TESTE PARA O MÉTODO DE DIVIDIR --------------------------- *");

        // 1) Teste do método multiplicar: Dois valores inteiros positivos
        System.out.println(calc.dividir(1, 2));

        // 2) Teste do método dividir: Dois valores inteiros,sendo o primeiro positivo, segundo negativo
        System.out.println(calc.dividir(1, -2));

        // 3) Teste do método dividir: Dois valores inteiros, sendo o primeiro negativo, segundo positivo
        System.out.println(calc.dividir(-1, 2));

        // 4) Teste do método dividir: Dois valores zerados
        System.out.println(calc.dividir(0, 0));

        // 5) Teste do método dividir: Dois valores positivos, sendo o primeiro de tipagem float e o segundo inteiro
        System.out.println(calc.dividir(5.5,1));

        // 6) Teste do método dividir: Um valor positivo inteiro e um caracter
        // System.out.println(calc.dividir('a',1));

        // 7) Teste do método dividir: Um valor positivo inteiro e um caracter
        System.out.println(calc.dividir(Integer.MAX_VALUE, 1));

        // 8) Teste de método dividir: Valores double
        System.out.println(calc.dividir(2.50,3.80));

        // 9) Teste de método dividir: Valores double MÁXIMOS
        System.out.println(calc.dividir(Double.MAX_VALUE,Double.MAX_VALUE));

        /*  DESCRIÇÃO DOS CENÁRIOS

            1) O cenário se apresentou eficiente e retornou o valor esperado, 0.5.
            2) O cenário se apresentou eficiente e retornou o valor esperado,-0.5.
            3) O cenário se apresentou eficiente e retornou o valor esperado,-0.5.
            4) NaN (Not avalable numeric)
            5) O cenário se apresentou eficiente e retornou o valor esperado, 5.5.
            6) O cenário se apresentou não eficiente, visto que o método subtrair foi previsto para receber dois número de tipo INT e ao passar um float, double ou long, char, ele apresentou um erro.
            7) O cenário se apresentou eficiente e retornou o valor esperado, 2.147483647E9.
            8) O cenário se apresentou eficiente e retornou o valor esperado, 0.65.
            9) Infinity

            CENÁRIOS 1, 2, 3, 4,7,8 TIVERAM ÊXITO;
            CENÁRIOS 4,6 CRASHOU
	    CENÁRIOS 9 OVERFLOW
        */
    }
}
