package org.altervista.growworkinghard.jswmm;

import java.util.*;

import org.apache.commons.configuration2.ex.ConfigurationException;

import java.util.HashMap;
import java.util.List;

public class testMain {
    public static void main(String[]args) throws ConfigurationException {
        INPparser testReader = new INPparser("file.ini", "OPTIONS");

        LinkedHashMap<String, List<String>> testReturn;

        testReturn = testReader.reader();
    }
}
