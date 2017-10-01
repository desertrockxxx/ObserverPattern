package de.sinan.observerpattern;

import java.util.*;

public class Party
{
    public static void main( String[] args )
    {
        Observer achim    = new JokeListener( "Achim" );
        Observer michael  = new JokeListener( "Michael" );
        JokeTeller chris  = new JokeTeller();

        // Fügt einen Observer hinzu. Das Argument darf nicht null sein.
        chris.addObserver( achim );

        chris.tellJoke();
        chris.tellJoke();

        chris.addObserver( michael );

        chris.tellJoke();

        // Entfernt den Observer o wieder.
        chris.deleteObserver( achim );

        chris.tellJoke();
    }
}


/*
http://openbook.rheinwerk-verlag.de/javainsel/javainsel_10_002.html

int countObservers()
    Liefert die Anzahl angemeldeter Observer.
void deleteObservers()
    Löscht alle angemeldeten Observer.
void clearChanged()
    Setzt den Zustand zurück, sodass bei notifyObservers() keine Meldungen gegeben werden.
boolean hasChanged()
    Liefert true, wenn das Objekt im Meldemodus ist.
void notifyObservers()
    Entspricht notifyObservers(null).
*/

