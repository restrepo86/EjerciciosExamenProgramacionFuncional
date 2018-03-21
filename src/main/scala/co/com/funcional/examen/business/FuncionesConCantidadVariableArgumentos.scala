package co.com.funcional.examen.business

object FuncionesConCantidadVariableArgumentos extends App {

  def average(numbers: Int*) : Double = numbers.foldLeft(0)((a, c) => a + c) / numbers.length


  def averageV1(numbers: Int*) : Double = numbers.sum / numbers.length


  def averageV2(wrongArgument: Int, numbers: Int *): Double = numbers.sum / numbers.length

  /**
    * Los Argumentos que son variables en tamaño se llaman VARARG,
    * estos se nombran finalizando con el signo (*) y deben estar
    * al final de todos los argumentos como en los ejemplos pasados
    */

  println(average(2,2))
  println(average(1,2,3))
  println(averageV1(1,2,3))
  println(average(1, 2, 3, 4, 5, 6, 7, 8, 9))

  println(averageV2(0, 2, 4))

}
