package instructions;  

public class Decrement extends Instruction {
	
	int r; 
	
	public Decrement(int r) {
		this.r = r;
	}
	
	void execute(Machine machine) {
		machine.registers[r]--; 
		machine.pc++;
	}
	
	
	


}
