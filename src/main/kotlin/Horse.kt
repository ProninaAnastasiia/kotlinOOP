class Horse :Animal() {
    override val food:String="сено"
    override val location:String="деревня"

    override fun makeNoise(){
        print("И-и-и-го-го!")
    }
    override fun eat(){
        print("Ест сено")
    }
}