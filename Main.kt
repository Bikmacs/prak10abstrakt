fun main() {
    try {
        var tovar1 = Tovarchik(true, "Магазин")
        tovar1.input()
        tovar1.info()
        tovar1.pls()
        tovar1.Q()
        tovar1.Qp()
        var tovar2 = TovarFor(true, "Шины")
        tovar1.input()
        tovar1.info()
        tovar1.pls()
        tovar1.Q()
        tovar1.Qp()
    }catch (e:Exception){
        println("Ошибка")
    }
}
