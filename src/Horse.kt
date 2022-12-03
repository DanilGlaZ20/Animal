class Horse:Animal()
{
    override  val name="Лошадка"
    override val food="овёс"
    override val location="стойло"
    override fun makeNoise(){println("фыркает")}
    override fun eat(){println("Лошадь ест $food")}
    override fun sleep() {println("Лошадь спит в загоне")}
    val formOfHoof=listOf("Широкое", "Узкое","Ассиметричное")
    val Speed:Int=60
}