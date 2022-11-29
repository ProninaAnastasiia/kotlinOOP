class Dog : Animal() {
    override val food:String="корм для собак"
    override val location:String="частный дом"

    override fun makeNoise(){
        print("Гав-гав!")
    }
    override fun eat(){
        print("Ест корм для собак")
    }
}