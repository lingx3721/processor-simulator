package instructions.types;

import instructions.Instruction;
import tomasulo.InstructionParameters;
import tomasulo.Op;
import simulator.Simulator;
import memory.Word;

public class Load extends Instruction {
	public Load (){
		this.setOP(Op.LOAD);
	}
	public short execute(InstructionParameters IP){
		short regB = IP.getRegB();
		short imm = IP.getImm();
		short address = (short) (regB+ imm);	
		String result = (Simulator.getDataMem().readWord(address)).getData(); //convert to short
		Short s = Short.parseShort(result);
		return s; //result
	}
	
}
