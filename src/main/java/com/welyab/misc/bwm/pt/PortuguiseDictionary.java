package com.welyab.misc.bwm.pt;

import java.util.Locale;

import com.welyab.misc.bwm.dictionary.spi.Dictionary;

public class PortuguiseDictionary implements Dictionary {

    private static final Locale LOCALE = new Locale("pt");

    public Locale getLocale() {
	return LOCALE;
    }
}
