package dut.archilog.intro;

public class Game {
	public static void main(String[] args) {
		// Etape 1 :
		//
		// Memory<?> memory = new TextualMemory(4, 5);
		//
		// Etape 2 :
		//
		// Memory<?> memory = new GraphicalMemory(4, 5);
		Memory<?> memory = new TextualMemory(4, 5);
		CharGenerator generator = new RandomCharGenerator();
		MemoryController.control(memory,generator);
	}
}
