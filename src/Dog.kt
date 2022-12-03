class Dog:Animal()
{
 override  val name="Собачка"
 override val food="мясо"
 override val location="двор"
 override fun makeNoise(){println("Гавкает")}
 override fun eat(){println("Пёс ест $food")}
 override fun sleep() {println("Собака спит в будке")}
 val mood=listOf("Angry", "Funny", "Sad")
 val devotion=listOf("Strong","Weak", "Neutral")
 val command:String=" "
}