// THE GAME
// beide Spieler starten mit 100 Life-Points. Du kannst pro Zug 3 Aktionen durchführen.
// Beispielsweise kannst du 3x attackieren oder auch 2x attackieren und 1x heilen.
// Gewonnen hat der Spieler, welcher am Ende noch am meisten Life-Points übrig hat.
// Wählst du die Klasse Magier:
// Attackieren sorgt für einen zufälligen Schaden beim Gegner zwischen 0 und 10 Life-Points.
// Heilen sorgt für einen zufälligen Heal zwischen 5 und 10 Life-Points.
// Wählst du die Klasse Krieger:
// Attackieren sorgt für einen zufälligen Schaden beim Gegner zwischen 5 und 15 Life-Points.
// Heilen sorgt für einen zufälligen Heal zwischen 0 und 5 Life-Points.
// Du kannst dir jeden der 3 Züge aussuchen, für deinen Gegner sind diese Zufällig gewählt.

fun main() {

    var playerOneLifePoints = 100
    var playerOneIsMagician: Boolean = false

    var playerTwoLifePoints = 100


    println("Du startest mit der Klasse Krieger.")
    // TODO: set playerOneIsMagician

    println("READY, SET, FIGHT!")

    // TODO: for loop playerOne
    println("Du bist am Zug!")

    // TODO: for loop playerTwo

    // TODO: calculateWinner
}

// TODO: implement chooseMagician function

// TODO: implement turnPlayerOne function

// TODO: implement turnPlayerTwo function

// TODO: implement calculateMove function

// TODO: implement calculateDamage function

// TODO: implement calculateHeal function

// TODO: implement calculateWinner function