import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Введите количество лайков: ")
    var likes = scanner.nextInt()
    when (likes) {
        1 -> print("Это понравилось $likes человеку")

        else -> print("то понравилось $likes людям")

    }

    /* получаем последнюю цифру в числе,
        чтобы определить склонение слова "лайк"
     */

    open fun getLastDigit(likes: Int): Int {
        return = likes % 10
    }
}