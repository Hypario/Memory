package dut.archilog.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompleteCharGenerator implements CharGenerator {

	@Override
	public List<Character> generate(int nbPairs) {
		if (nbPairs > 26) {
			throw new IllegalArgumentException("Ne fonctionne pas au delà de 26 pairs");
		}
		List<Character> cards = new ArrayList<>();
		char current;
		for (int i = 0; i < nbPairs; i++) {
			current = (char) (i + 65);
			cards.add(current);
			cards.add(current);
		}
		Collections.shuffle(cards);
		return cards;
	}

}