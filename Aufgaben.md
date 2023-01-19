<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Schleifen</h3>

#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 24. Heute wiederholen wir alles, was wir diese Woche gelernt haben: While-Schleife, Do-While-Schleife, For-Schleife und das break Schlüsselwort.

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
- [Handbuch: Schleifen → Verstehen → Programmfluss und Laufvariablen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.khc665cedvja)
- [Handbuch: Schleifen → Implementieren → Laufvariablen implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.4b4isj8cze29)
- [Handbuch: Schleifen → Implementieren → while-Schleife implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.hf34b5wgif84)
- [Handbuch: Listen → Implementieren → Größe einer Liste lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bvtmwoufzcex)
- [Handbuch: Listen → Implementieren:MutableList → Wert in MutableList an Index ändern](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.x824jd5wl02t)

---

<details>
<summary> <b> Aufgabe 1 - Break </b> </summary>

Das Schlüsselwort `break` wird verwendet, um vorzeitig aus einer Schleif auszubrechen.

In der Aufgabendatei ist eine Liste numbers vorgegeben.  

Schreibe eine Schleife, die vom Anfang der Liste ausgehend eine Zahl nach der Anderen 
prüft und in der Konsole ausgibt.
Wenn die Zahl gleich `42` ist, gib in der Konsole "Zahl gefunden." aus.
Breche dann die Schleife mit `break` ab.

In der Konsole sollte dann folgendes zu sehen sein:

62  
34  
364  
235  
57  
68  
2  
325  
6

**Modul für die Aufgabe:** Aufgabe1  
**Datei für die Aufgabe:** Break.kt

</details>

---

<details>
<summary> <b> Aufgabe 2 - Continue </b> </summary>

Das Schlüsselwort `continue` wird verwendet, um vorzeitig einen Durchlauf einer Schleife zu beenden.

In der Aufgabendatei ist eine Liste numbers vorgegeben.

Schreibe eine Schleife, die vom Anfang der Liste ausgehend eine Zahl nach der Anderen
prüft.  
Wenn die Zahl gleich `42` ist, beenden den momentanen Durchlauf der Schleife mit `continue`, 
ansonsten geben wir die Zahl in der Konsole aus. 

In der Konsole sollte dann folgendes zu sehen sein:

34  
235  
24  
7346  
34

**Modul für die Aufgabe:** Aufgabe2  
**Datei für die Aufgabe:** Continue.kt

</details>

---

<details>
<summary> <b> Aufgabe 3 - While-Schleife </b> </summary>

Erstelle jetzt eine eigene While-Schleife, die über die veränderbare Liste numbers läuft   
und jedes Element in der Liste mit 3 multipliziert und das Ergebnis wieder an derselben Stelle in 
der Liste speichert.  
Danach soll die Liste in der Konsole ausgegeben werden.  
Überprüfe, ob deine While-Schleife richtig funktioniert.  

a)

Lager deine Schleife in einer Funktion aus.  
Die Liste soll als Parameter übergeben werden und die veränderte Liste wieder zurückgegeben werden.  
Deine Funktion soll zusätzlich eine Zahl als Parameter bekommen, mit der (anstelle von der 3) 
die Werte in der Liste multipliziert werden.  

**Modul für die Aufgabe:** Aufgabe3  
**Datei für die Aufgabe:** WhileSchleife.kt

</details>

---

<details>
<summary> <b> Aufgabe 4 - Waschtag </b> </summary>

Es ist Waschtag.  
Wir haben einen Haufen an T-Shirts (veränderbare Liste shirts) die wir waschen wollen.  
Dazu müssen wir die T-Shirts erstmal nach Farbe sortieren.

Schreibe eine Schleife deiner Wahl, die die Liste an T-Shirts durchgeht.  
Wenn die Farbe Rot ist, füge das T-Shirt der Liste redShirts hinzu.
Wenn die Farbe Blau ist, füge das T-Shirt der Liste blueShirts hinzu.  
Wie viele T-Shirts jeder Farbe gibt es?

**Modul für die Aufgabe:** Aufgabe4  
**Datei für die Aufgabe:** Waschtag.kt

</details>



---

<details>
<summary> <b> Aufgabe 5 - Summe </b> </summary>

Wir kriegen von unserem Chef eine Liste mit Gebühren, die zu bezahlen sind.  
Er möchte wissen, wie viel er insgesamt Zahlen muss.

Schreibe eine Funktion, die eine Liste mit Gebühren als Parameter bekommt,  
die Gebühren zusammen addiert und das Ergebnis wieder zurückgibt.

- Du darfst für deine Lösung nicht die `sum()` Funktion verwenden.
- Löse das Problem mit einer Schleife.

Deine Funktion stimmt, wenn du in etwa `5366.78` heraus bekommst,  
(Das Ergebnis kann sich von Computer zu Computer ein ganz kleines bisschen Unterscheiden). 



**Modul für die Aufgabe:** Aufgabe5  
**Datei für die Aufgabe:** Gebuehren.kt

</details>

---

<details>
<summary> <b> Aufgabe 6 - Das kleinste Element einer Liste </b> </summary>

Für ein Spiel müssen wir herausfinden, welche Zahl die kleinste Zahl in einer Liste ist.
- Du darfst für deine Lösung nicht die `min()` Funktion verwenden.
- Löse das Problem mit einer Schleife.

Schreibe eine Funktion, die eine Liste mit Zahlen als Parameter bekommt.  
Schreibe in der Funktion eine Schleife deiner Wahl, die über die Zahlenliste läuft
und die kleinste Zahl herausfindet.  
Anschließend gibt die Funktion die kleinste Zahl zurück und in der Konsole aus.

Deine Funktion stimmt, wenn du `24` heraus bekommst.



**Modul für die Aufgabe:** Aufgabe6  
**Datei für die Aufgabe:** KleinsteElement.kt

</details>

---

<details>
<summary> <b> Aufgabe 7: Jahreszeiten </b> </summary>

Gegeben ist eine Liste monate mit allen 12 Monaten.  

a)

Schreibe eine Funktion, die einen Monat als Parameter erhält 
und die Jahreszeit für den Monat zurückgibt.

Die Monate sind dabei so auf die Jahreszeiten verteilt:  

Dezember, Januar, Februar -> Winter  
März, April, Mai  -> Frühling   
Juni, Juli, August -> Sommer  
September, Oktober, November -> Herbst

D.h. wenn die Funktion den Monat "April" als Parameter bekommt,  
soll die Funktion die Jahreszeit "Frühling" zurückgeben.

b)

Schreibe jetzt in der main()-Funktion eine Schleife, 
die alle Monate mit ihrer Jahreszeit in der Konsole ausgibt.

In der Konsole sollte dann folgendes ausgegeben werden:

```kotlin
Der Januar ist im Winter
Der Februar ist im Winter
Der März ist im Frühling
...
Der Dezember ist im Winter
```

c)

Schreibe zusätzlich eine Schleife deiner Wahl, die nur die Sommermonate in der Konsole ausgibt.

d)

Schreibe zusätzlich eine Schleife deiner Wahl, die alle Monate außer den Juni und den September ausgibt.

e)

Schreibe zusätzlich eine Schleife deiner Wahl, die ab dem März jeden zweiten Monat ausgibt.


**Modul für die Aufgabe:** Aufgabe7  
**Datei für die Aufgabe:** Jahreszeiten.kt

</details>

---