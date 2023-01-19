//todo: Wir kriegen von unserem Chef eine Liste mit Gebühren, die zu bezahlen sind.
// Er möchte wissen, wie viel er insgesamt Zahlen muss.
// Schreibe eine Funktion, die eine Liste mit Gebühren als Parameter bekommt, die Gebühren zusammen addiert und das
// Ergebnis wieder zurückgibt.
// Du darfst für deine Lösung nicht die sum() Funktion verwenden.
// Löse das Problem mit einer Schleife.
// Deine Funktion stimmt, wenn du in etwa 5366.78 heraus bekommst,
// (Das Ergebnis kann sich von Computer zu Computer ein ganz kleines bisschen Unterscheiden).

fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)
    gebuehren(fees)
}

fun gebuehren(gebuehrenListe: List<Double>){
    var rechnung = 0.0

    for(i in 0 until gebuehrenListe.size){
        if (i == 0){
            println("""
                |Wir erstellen ein neues Rechnungsdokument und fügen folgende Beträge hinzu: 
                |  ${gebuehrenListe[i]}€""".trimMargin())
            rechnung += gebuehrenListe[i]
        }
        else if (i >= 1) {
            println("+ ${gebuehrenListe[i]}€")
            rechnung += gebuehrenListe[i]
        }
    }
    println("---------")
    println(" ${rechnung}€")
}