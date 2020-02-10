package dut.archilog.intro;

import java.util.List;

public interface CharGenerator {
	/**
	 * Generate a list of pairs for the memory game
	 * 
	 * @param nbPairs a number of pairs
	 * @return a list containing nbPairs, thus of size 2*nbPairs.
	 */
	List<Character> generate(int nbPairs);
}