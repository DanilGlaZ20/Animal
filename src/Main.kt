fun main()
{
    val animals=Animal()
    val veterinarian=Veterinarian()
    val AnimalArr= arrayOf(Cat(),Dog(),Horse())
    for (animals in AnimalArr) veterinarian.treateAnimal(animals)
    
    val dog=Dog()
    val cat=Cat()
    val horse=Horse()
    print("Пес:"+dog.mood[0]
            +"\nКот:"+cat.flexybility[1]
            +"\nЛошадь имеет форму копыта: "+ horse.formOfHoof[2])
}