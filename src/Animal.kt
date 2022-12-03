import java.util.*

open class Animal
{
    open val name=""
   open val food="всякое"
   open  val location:String="где-то"
    open fun makeNoise() { println("Животное издает характерный звук") }
    open fun eat(){println("Животное ест") }
    open fun sleep(){println("Животное спит")}

}
