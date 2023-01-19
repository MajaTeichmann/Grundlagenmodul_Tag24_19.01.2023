//todo: Gegeben ist eine Liste monate mit allen 12 Monaten.
// a) Schreibe eine Funktion, die einen Monat als Parameter erhält und die Jahreszeit für den Monat zurückgibt.
// Die Monate sind dabei so auf die Jahreszeiten verteilt:
// Dezember, Januar, Februar -> Winter
// März, April, Mai -> Frühling
// Juni, Juli, August -> Sommer
// September, Oktober, November -> Herbst
// D.h. wenn die Funktion den Monat "April" als Parameter bekommt,
// soll die Funktion die Jahreszeit "Frühling" zurückgeben.
// b) Schreibe jetzt in der main()-Funktion eine Schleife, die alle Monate mit ihrer Jahreszeit in der Konsole ausgibt.
// In der Konsole sollte dann folgendes ausgegeben werden:
// Der Januar ist im Winter
// Der Februar ist im Winter
// Der MÃ¤rz ist im FrÃ¼hling
// ...
// Der Dezember ist im Winter
// c) Schreibe zusätzlich eine Schleife deiner Wahl, die nur die Sommermonate in der Konsole ausgibt.
// d) Schreibe zusätzlich eine Schleife deiner Wahl, die alle Monate außer den Juni und den September ausgibt.
// e) Schreibe zusätzlich eine Schleife deiner Wahl, die ab dem März jeden zweiten Monat ausgibt.

fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )

    println("\n Monate nach Jahreszeit ausgeben: \n")

    for (monat in monate)
        println("${monat} -> ${jahresZeiten(monat)}")

    val fruehling = mutableListOf<String>("März", "April", "Mai")
    val sommer = mutableListOf<String>("Juni", "Juli", "August")
    val herbst = mutableListOf<String>("September", "Oktober", "November")
    val winter = mutableListOf<String>("Dezember", "Januar", "Februar")

    println("\n Monate im Sommer ausgeben: \n")
    for(monat in monate){
        if (monat in sommer){
            println(monat)
        }
    }

    println("\n Alle Monate außer Juni und September ausgeben: \n")
    for (monat in monate){
        if (monat != "Juni" && monat != "September"){
            println(monat)
        }
    }

    println("\n Ab März alle 2 Monate ausgeben: \n")
    for(i in 2..monate.size-1 step 2){
        println(monate[i])
    }
}

fun jahresZeiten(monat:String): String{
    return when (monat){
        "Dezember", "Januar", "Februar" -> "Winter"
        "März", "April", "Mai" -> "Frühling"
        "Juni", "Juli", "August" -> "Sommer"
        "September", "Oktober", "November" -> "Herbst"
        else -> "kein gültiger Monat!"
    }
}