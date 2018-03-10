package co.com.funcional.examen.business

object InformacionEstructurada extends App {

 case class Note(
   name: String,
   duration: String,
   octave: Int
 )

 val c3 = Note("C", "Quarter", 3)
 print("C".equals(c3.name))
 print("Quarter".equals(c3.duration))
 print(3.equals(c3.octave))




}
