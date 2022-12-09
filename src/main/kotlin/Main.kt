fun main() {
    val amount = 100000
    val comission = 0.0075

    if(amount < 3500) {
        println("Неподдерживаемая сумма перевода!")
    }
    else {
        val totalAmount = (amount*comission + amount)/100
        println("Сумма к оплате $totalAmount руб")
    }
}