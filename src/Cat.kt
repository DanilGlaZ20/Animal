class Cat( name:String="Котик", food:String="Корм", location:String="Квартира"):Animal(name, food, location )
{

    override fun makeNoise(){println("мурчит")}
    override fun eat(){println("Кот ест $food")}
    override fun sleep() {println("Кот спит на диване")}
    val claw=18
    val luck="Всё еще живу и умирать не собираюсь"
    val flexybility= listOf("Гибкий", "НЕ гибкий")
}