fun main()
{

    val veterinarian=Veterinarian()
    val AnimalArr= arrayOf(Cat(),Dog(),Horse())
    for (animals in AnimalArr) veterinarian.treateAnimal(animals)
    
    val dog=Dog("Волк","Зайца", "Лес")
    val cat=Cat()
    val horse=Horse()
    print(dog.name+dog.mood[0]
            +"\n${cat.name.toString()} "+cat.flexybility[1]
            +"\n${horse.name.toString()} имеет форму копыта: "+ horse.formOfHoof[2])
}