open class TovarFor(var baz:Boolean, var names:String):Tovar() {
    override var name:String= ""
    override var price:Double = 0.0
    override var count:Int = 0
    override var Baza=baz
    override fun Q():Double {
        var Q1=price/count
        return Q1
    }
    override fun Qp():Double{
        return 0.0
    }
    fun input(){
        println("Введите количество товара")
        count = readLine()!!.toDouble().toInt()
        println("Введите цену")
        price = readLine()!!.toInt().toDouble()
    }
}