package dut.archilog.intro;

import java.lang.reflect.InvocationTargetException;

/**
 * Patron de conception Factory Method pour cacher l'implémentation concrête de
 * Memory.
 */
public class MemoryFactory {
    private MemoryFactory() {
        // pas de création d'instance de cette classe
    }

    public static Memory<?> makeMemory() {
        String[] implementations = { "Graphical", "Textual", "Fake" };
        Class<? extends Memory<?>> clazz;
        for (String impl : implementations) {
            try {
                clazz = (Class<? extends Memory<?>>) Class.forName("dut.archilog.intro." + impl + "Memory");
                return clazz.getConstructor(new Class<?>[] { int.class, int.class }).newInstance(4, 5);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                    | InvocationTargetException | NoSuchMethodException e) {
            }
        }
        throw new IllegalStateException("On devrait avoir trouvé FakeMemory !");

    }
}