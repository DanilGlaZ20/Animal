class Cat:Animal()
{
    override  val name="Котик"
    override val food="корм"
    override val location="квартира"
    override fun makeNoise(){println("мурчит")}
    override fun eat(){println("Кот ест $food")}
    override fun sleep() {println("Кот спит на диване")}
    val claw=18
    val luck="Всё еще живу и умирать не собираюсь"
    val flexybility= listOf("Гибкий", "НЕ гибкий")
}