package de.sinan.observerpattern;

import java.util.*;

class JokeListener implements Observer
{
    final private String name;

    JokeListener( String name )
    {
        this.name = name;
    }

    @Override public void update( Observable o, Object arg )
    {
        System.out.println( name + " lacht über: \"" + arg + "\"" );
    }
}