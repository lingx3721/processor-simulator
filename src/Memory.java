
public class Memory {
private int s;
private int l;
private CacheEntry[] entries;

public Memory(int l){
	this.s=64*1024;
	this.l=l;
}
public int getS() {
	return s;
}
public int getL() {
	return l;
}

public CacheEntry[] getEntries() {
	return entries;
}
public void setEntries(CacheEntry[] entries) {
	this.entries = entries;
}

public CacheEntry readInMemory(int lineAddress){
	return entries[lineAddress];
	
}



}
