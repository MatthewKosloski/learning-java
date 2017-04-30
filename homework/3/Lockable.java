//********************************************************************
// Lockable.java
//
// Programming Project 7.8 on page 402.
//********************************************************************

public interface Lockable {

	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean locked();

}