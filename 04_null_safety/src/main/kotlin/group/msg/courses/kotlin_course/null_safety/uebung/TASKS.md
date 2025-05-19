# Aufgaben zu Nullability
## Aufgabe 1 - Klassenmodellierung

Wir möchten für unsere Webanwendung ein Registrierungssystem schreiben.

Implementiere dafür die Klasse "User".

Benutzer haben dabei folgende Eigenschaften:
* username
* password
* email
* phoneNumber, optional
* dateOfBirth, optional

Teste anschließend deine Implementierung mit dem NullabilityTasksTest auf Korrektheit.

Versuche zudem, auf die einzelnen Eigenschaften deiner gerade implementierten Klasse zuzugreifen. Was musst Du bei "nullable properties" beachten?

## Aufgabe 2 - Codevereinfachung
In der Klasse `SimplifyMe` findest Du eine Funktion `simplifyMe()`.

Versuche, die Implementierung dieser Funktion durch die Anwendung des Safe Call operators `.?` sowie Smart Casts kompakter zu schreiben.

## Aufgabe 3 - Elvis Operator
In der Klasse `ElvisOperator` findest Du die Funktion `elvisOperatorTask()`: Diese ruft `maybeGreet()` auf, welche manchmal einen `String`, und manchmal auch `null` zurückgeben kann. Entsprechend ist der Rückgabetyp `String?`.

Die gegebene Implementierung von `elvisOperatorTask()` ist sehr ausführlich. Mit Kotlins Elvis Operator lässt sich das deutlich kompakter schreiben!

Tipp: Die gesamte Funktion lässt sich auf eine Zeile vereinfachen.