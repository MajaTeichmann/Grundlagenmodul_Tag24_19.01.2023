// todo: Es ist Waschtag.
//  Wir haben einen Haufen an T-Shirts (veränderbare Liste shirts) die wir waschen wollen.
//  Dazu müssen wir die T-Shirts erstmal nach Farbe sortieren.
//  Schreibe eine Schleife deiner Wahl, die die Liste an T-Shirts durchgeht.
//  Wenn die Farbe Rot ist, füge das T-Shirt der Liste redShirts hinzu. Wenn die Farbe Blau ist, füge das T-Shirt der
//  Liste blueShirts hinzu.
//  Wie viele T-Shirts jeder Farbe gibt es?

fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )

    val roteShirts = mutableListOf<String>()
    val blaueShirts = mutableListOf<String>()

    for (i in shirts) {
        when (i) {
            "rot" -> roteShirts.add(i)
            "blau" -> blaueShirts.add(i)
        }
    }
    shirts.clear()
    println("Wir haben ${roteShirts.count()} rote und ${blaueShirts.count()} blaue Shirts!")
}