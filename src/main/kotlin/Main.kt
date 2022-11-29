fun main() {
    print(solution("a1", "c3"))
}

fun solution(bishop: String, pawn: String): Boolean {
    if (Math.abs(bishop[0].code - pawn[0].code) == Math.abs((bishop[1].digitToInt() - pawn[1].digitToInt()))) {
        return true
    }
    return false
}