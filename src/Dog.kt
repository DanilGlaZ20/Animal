class Dog( name:String="Собачка", food:String="Мясо", location:String="Двор"):Animal(name, food, location )
{

 override fun makeNoise(){println("Гавкает")}
 override fun eat(){println("Пёс ест $food")}
 override fun sleep() {println("Собака спит в будке")}
 val mood=listOf("Angry", "Funny", "Sad")
 val devotion=listOf("Strong","Weak", "Neutral")
 val command:String=" "
}