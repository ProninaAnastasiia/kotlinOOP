class Dog(food: String, location: String) : Animal(food, location) {
    var wouf = "гав"
    override fun makeNoise(){
        print("$wouf-$wouf!")
    }
    override fun eat(){
        print("Собака ест $food")
    }
}