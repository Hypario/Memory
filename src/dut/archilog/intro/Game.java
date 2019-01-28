package dut.archilog.intro;

public class Game {
	public static void main(String[] args) {
		Memory<?> memory = MemoryFactory.makeMemory();
		MemoryControler controler = new MemoryControler();
		CharGenerator generator = new RandomCharGenerator();
		controler.control(memory,generator);
	}
}
