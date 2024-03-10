abstract class Tovar():Info{
    abstract var name:String
    abstract var price:Double
    abstract var count:Int
    abstract var Baza:Boolean
    override fun info(){
        println("Название товара:${name}, Цена товара:${price}, Количество товара:${count}")
    }

    abstract fun Q(): Double
    abstract fun Qp(): Double
}