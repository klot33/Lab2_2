fun countCharacters(input: String): Map<Char, Int> {
    val characterCount = mutableMapOf<Char, Int>()

    for (char in input) {
        characterCount[char] = characterCount.getOrDefault(char, 0) + 1
    }

    return characterCount.toSortedMap()
}

fun main() {
    println("Программа подсчитывает количество различных символов во введенной строке.")

    while (true) {
        println("Введите строку символов (или введите 'exit' для выхода):")
        val input = readln().trim()

        if (input.isEmpty()) {
            println("Ошибка: строка не должна быть пустой. Попробуйте снова.")
            continue
        }

        if (input.equals("exit", ignoreCase = true)) {
            println("Выход из программы.")
            break
        }

        val result = countCharacters(input)

        println("Количество символов в строке:")
        for ((char, count) in result) {
            println("$char - $count")
        }
    }
}