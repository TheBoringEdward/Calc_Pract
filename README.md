#A vage retelling of the tale of this project
***
There are some issues to fix, like giving some methods a return value. Not sure if I wanna continue
to work on the Fract class.
-Edward 2130 01.12.21
***
Hallo Kilian,

das ist sehr schoen. Hier ein paar Anmerkungen, damit dir morgen nicht langweilig wird.

1) Die Methode set_n() sollte als setter method eigentlich void sein.
   Done (See set or qSet)
2) Die Methode prim() sollte eigentlich boolean sein.
   Done (See gPrim)
3) in gPrim() fehlt nach dem else eine {.
   Done
4) Die Methode rnd() sollte als Parameter die Anzahl Nachkommastellen bekommen.

5) In sub() koenntest du n=n-s; abkuerzen zu n-=s;
   Done 18?? 2.12.21
6) Die Methoden siz() und qSize() sollten auch boolean sein.
   Done (See gSiz) 18?? 2.12.21
7) In gSiz() ist die Zeile return n>g; sehr clever! :)
   Uh... 18?? 2.12.21
8) Du hast mehrmals die fast gleichen Methoden, mal mit q mal mit g im Anlaut. Was bedeuten diese Buchstaben eigentlich?
   q = questionnaire -> Textpromt asking for parameters; g = get -> Returns something 18?? 2.12.21
9) Schreibe doch noch eine Hauptklasse, welche die Methoden alle ausprobiert.
   Done... 18?? 2.12.21
10) Dein Bruch hat sechs Variablen c,d,i,j,k,name. Was soll das sein? Schreibe da zu jeder Variablen einen Kommentar.
    Done 18?? 2.12.21
11) Der Zaehler sollte numerator heissen statt counter. ;)
    Done 18?? 2.12.21
12) Wenn du zu einem Bruch einen anderen Bruch hinzuaddierst, solltest du anschliessend das Ergebnis noch einmal kuerzen. ZB ist 1/10+3/10 = 4/10 = 2/5.

Viel Spass damit.
Liebe Gruesse

Klaus Wiele
-Dr. Wiele ???? 30.11.21
***
Have to do some documentation and clean up the code. Fixed most of the above mentioned issues.
-Edward 1821 2.12.21
***
Cleaned it, still gotta add documentation
-Edward 1834 2.12.21
***