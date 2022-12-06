open class Animal (food: String, location: String) {
    var food: String = ""
    var location:String=""

    init{
        this.food = food
        this.location = location
    }

    open fun makeNoise(){
        print("Животное издает звук")
    }

    open fun eat(){
        print("Животное ест")
    }
    open fun sleep(){
        print("Животное спит")
    }
}