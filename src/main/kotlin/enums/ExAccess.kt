package enums

fun main() {
    println(Role.USER.name + " pode excluir? " + Role.USER.canDelete())
    println(Role.MODERADOR.name + " pode excluir? " + Role.MODERADOR.canDelete())
    println(Role.ADMIN.name + " pode excluir? " + Role.ADMIN.canDelete())
}

enum class Role(private val level: Level) {
    USER(Level.BASIC),
    MODERADOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun canDelete() = this == ADMIN
}

enum class Level {
    BASIC, MEDIUM, HIGH
}