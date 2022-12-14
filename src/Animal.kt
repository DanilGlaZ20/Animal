

open class Animal constructor(val name:String,val food:String, val location:String)
{
    open fun makeNoise() { println("Животное издает характерный звук") }
    open fun eat(){println("Животное ест") }
    open fun sleep(){println("Животное спит")}

}
