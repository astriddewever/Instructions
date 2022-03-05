package instructions;

public class LoadConstant extends Instruction {
	
	int c; 
	int r; 
	
	LoadConstant(int c, int r){
		this.c = c;
		this.r = r;
	}
	
	void execute(Machine machine) {
		machine.registers[r] = c; 
		machine.pc++;
	}
	

}
