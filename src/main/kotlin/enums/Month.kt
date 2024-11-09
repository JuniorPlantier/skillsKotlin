package enums

fun main() {
    val month = Month.FEBRUARY
    println(month.numberOfMonth)
    println(month.name) // converte em String

    println(month.next())

    val month11: Month = Month.getEnumByNumberOfMonth(11)
    println(month11.getTotalDays())
}

enum class Month(val numberOfMonth: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    fun next(): Month {
        return Month
            .values()
            .find{ it.numberOfMonth == numberOfMonth + 1 }
            ?: JANUARY
    }

    companion object {
        fun getEnumByNumberOfMonth(numberOfMonth: Int): Month {
            return Month
                .values()
                .first {it.numberOfMonth == numberOfMonth} // lança exceção
        }
    }

    fun getTotalDays(): Int {
        return when (this) {
            JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31
            FEBRUARY -> 28
            else -> 30
        }
    }
}