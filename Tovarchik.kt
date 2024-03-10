class Tovarchik(baz:Boolean, name:String):TovarFor(baz, name){
    fun pls()
    {
        println("хотите расчитать? 1-да, 2-нет")

        var fd = readln()!!.toInt()
        if (fd == 1)
            Baza==true
        else if(fd==2)
            Baza= false
    }

    var Qp:Double =0.0
    override fun Qp():Double{
        println("Введите год выпуска детали")
        var p = readLine()!!.toInt()
    if (Baza)
        Qp=Q()+0.5*(2024-p)
        return Qp
    }
}
