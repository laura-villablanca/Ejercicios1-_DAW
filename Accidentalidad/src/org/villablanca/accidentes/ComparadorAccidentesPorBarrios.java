package org.villablanca.accidentes;

import java.util.Comparator;

public class ComparadorAccidentesPorBarrios implements Comparator<AccidenteTrafico> {

	@Override
	public int compare(AccidenteTrafico o1, AccidenteTrafico o2) {
		AccidenteTrafico accidente = new AccidenteTrafico();
		return o1.getDistrito().compareTo(o2.getDistrito());
	}

}
