class Horse( name:String="Лошадка", food:String="Овёс", location:String="Стойло"):Animal(name, food, location )
{

    override fun makeNoise(){println("фыркает")}
    override fun eat(){println("Лошадь ест $food")}
    override fun sleep() {println("Лошадь спит в загоне")}
    val formOfHoof=listOf("Широкое", "Узкое","Ассиметричное")
    val Speed:Int=60
}