//todo: Erstelle jetzt eine eigene While-Schleife, die über die veränderbare Liste numbers läuft
// und jedes Element in der Liste mit 3 multipliziert und das Ergebnis wieder an derselben Stelle in der Liste speichert.
// Danach soll die Liste in der Konsole ausgegeben werden.
// Überprüfe, ob deine While-Schleife richtig funktioniert.
// a) Lager deine Schleife in einer Funktion aus.
// Die Liste soll als Parameter übergeben werden und die veränderte Liste wieder zurückgegeben werden.
// Deine Funktion soll zusätzlich eine Zahl als Parameter bekommen, mit der (anstelle von der 3) die Werte in der Liste multipliziert werden.

val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)
var i = 0

fun main() {
    println("Nenne mir eine Zahl zwischen 1 und 100, mit der du rechnen möchtest!")
    schleife(readln().toDouble())
}

fun schleife(zahl: Double){

    while (i in 0..numbers.size-1){
        if(zahl >= 1 && zahl <= 100){
            numbers[i] *= zahl
            i++
        } else (
            println("Falsche Eingabe!")
        )
            break
    }
    println(numbers)

}
