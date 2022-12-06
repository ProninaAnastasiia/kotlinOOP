class Horse (food: String, location: String) : Animal(food, location) {
    var iiigogo = "И-и-и-го-го"
    override fun makeNoise(){
        print("$iiigogo!")
    }
    override fun eat(){
        print("Лошадь ест $food")
    }
}