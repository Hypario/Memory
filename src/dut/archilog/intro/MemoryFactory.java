
/**
 * Patron de conception Factory Method pour cacher 
 * l'implémentation concrête de Memory.
 */
public class MemoryFactory {
    private MemoryFactory() {
        // pas de création d'instance de cette classe
    }

    public static Memory<?> makeMemory() {
        // Etape 1 :
		// 
		// return new TextualMemory(4, 5);
		//
		// Etape 2 :
		// 
		// return new GraphicalMemory(4, 5);
        return new FakeMemory();
    }
}