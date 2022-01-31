/**
 * Lock.java
 *
 * Lock, the Super file for different types of locks.
 *
 * @author axu5 <github.com/axu5>
 * @version 27.01.2022
 */
public class Lock {
  boolean locked = true;

  public String toString() {
    return "I am " + (locked ? "" : "un") + "locked";
  }

  public boolean amILocked() {
    return locked;
  }

  public void open() {
    locked = false;
  }

  public void close() {
    locked = true;
  }
}