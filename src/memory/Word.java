package memory;
import java.io.Serializable;

public class Word implements Serializable{
	private boolean[] bits;
	
	public Word(){
		this.bits = new boolean[16];
	}

	public boolean[] getBits() {
		return bits;
	}

	public void setBits(boolean[] bits) {
		this.bits = bits;
	}

}
