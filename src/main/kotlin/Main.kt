fun main() {
    val animals: Array<Animal> = arrayOf(Cat(),Dog(),Horse())
    for(i in animals){
        Veterinarian().treatAnimal(i)
    }

}