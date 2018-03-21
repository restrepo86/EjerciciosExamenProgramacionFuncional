package co.com.funcional.examen.business

import scala.annotation.tailrec

object RecursividadDeCola extends App {

  @tailrec
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  print(s"El maximo comun divisor de 10 y 20 es ${gcd(10000, 20000)}")


  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)
  print(s"El factorial de 12 es ${factorial(15)}")

}



