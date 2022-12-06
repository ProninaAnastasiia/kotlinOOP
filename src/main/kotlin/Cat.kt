class Cat (food: String, location: String) : Animal(food, location) {
    var meow = "мяу"
    override fun makeNoise(){
        print(meow)
    }
    override fun eat(){
        print("Кошка ест $food")
    }
}