open class Animal {
    open val food:String=""
    open val location:String=""

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