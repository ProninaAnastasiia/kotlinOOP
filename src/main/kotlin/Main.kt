fun main() {
    val animals: Array<Animal> = arrayOf(Cat("Вискас","квартира"),Dog("Педигри","частный дом"),Horse("сено","конюшня"))
    for(i in animals){
        Veterinarian().treatAnimal(i)
    }
}