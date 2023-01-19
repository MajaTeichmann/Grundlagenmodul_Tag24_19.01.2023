//todo: Für ein Spiel müssen wir herausfinden, welche Zahl die kleinste Zahl in einer Liste ist.
// Du darfst für deine Lösung nicht die min() Funktion verwenden.
// Löse das Problem mit einer Schleife.
// Schreibe eine Funktion, die eine Liste mit Zahlen als Parameter bekommt.
// Schreibe in der Funktion eine Schleife deiner Wahl, die über die Zahlenliste läuft und die kleinste Zahl herausfindet.
// Anschließend gibt die Funktion die kleinste Zahl zurück und in der Konsole aus.
// Deine Funktion stimmt, wenn du 24 heraus bekommst.

fun main() {
    val numbers = listOf(
        35, 35, 37, 246, 246, 357, 234, 4237, 476, 2346, 24, 347, 357, 67,
        52315, 346, 3567, 346, 235, 26, 357, 486, 457, 246, 246, 3247,
        35, 247, 2437, 274, 374, 35, 634, 35, 37, 2436, 43
    )
    val smallest = kleinsteZahl(numbers)
    println(smallest)
}

fun kleinsteZahl(numbers: List<Int>): Int {
    var kleinste = numbers[0]
    for (i in numbers) {
        if (i <= kleinste) {
            kleinste = i
        }
    }
    return kleinste
}
