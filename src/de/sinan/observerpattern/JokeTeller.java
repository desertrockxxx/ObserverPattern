package de.sinan.observerpattern;

import java.util.*;

class JokeTeller extends Observable
{
    private static final List<String> jokes = Arrays.asList(
            "Sorry, aber du siehst so aus, wie ich mich fühle.",
            "Eine Null kann ein bestehendes Problem verzehnfachen.",
            "Wer zuletzt lacht, hat es nicht eher begriffen.",
            "Wer zuletzt lacht, stirbt wenigstens fröhlich.",
            "Unsere Luft hat einen Vorteil: Man sieht, was man einatmet."
    );

    public void tellJoke()
    {
        // Markiert das Objekt als sendebereit, sodass bei notifyObservers() Meldungen gegeben werden.
        setChanged();
        Collections.shuffle( jokes );
        // Liefert hasChanged() wahr, dann informiert das Observable alle Observer und übergibt arg der update()-Methode.
        notifyObservers( jokes.get(0) );
    }
}
