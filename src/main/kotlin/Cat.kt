class Cat :Animal() {
    override val food:String="кошачий корм"
    override val location:String="квартира"

    override fun makeNoise(){
        print("Мяу!")
    }
    override fun eat(){
        print("Ест кошачий корм")
    }
}