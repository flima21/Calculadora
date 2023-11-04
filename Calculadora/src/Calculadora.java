/**
 * Representação de uma calculadora
 *
 * @author Felipe Pedroso de Lima
 * @version 1.0
 */
public class Calculadora {

  /**
   *
   * @param value_1 int
   * @param value_2 int
   * @return int
   */
  public int somar(int value_1, int value_2) {
    return (value_1 + value_2);
  }

  /**
   *
   * @param value_1 int
   * @param value_2 int
   * @return int
   */
  public int subtrair(int value_1,int value_2) {
    return (value_1 - value_2);
  }

  /**
   *
   * @param value_1 double
   * @param value_2 double
   * @return double
   */
  public double dividir(double value_1,double value_2) {
    return (value_1 / value_2);
  }

  /**
   *
   * @param value_2 double
   * @param value_1 double
   * @return double
   */
  public double multiplicar(double value_1,double value_2) {
    return (value_1 * value_2);
  }
}