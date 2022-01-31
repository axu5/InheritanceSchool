/**
 * LockDriver.java
 *
 * create a lock object
 * 
 * test locked,
 * open it
 * 
 * create combination lock,
 * test lock
 * 
 * try to open
 * 
 * 1. wrong combination
 * 
 * 2. correct combination
 *
 * @author axu5 <github.com/axu5>
 * @version 28.01.2022
 */
public class LockDriver {
  public static void main(String[] _args) {
    var lock = new Lock();

    System.out.println(lock); // locked
    lock.open();
    System.out.println(lock); // unlocked

    var comboLock = new CombinationLock("YO WAS GOOD");

    System.out.println(comboLock); // just created should be locked
    comboLock.open();
    System.out.println(comboLock); // wrong combination should keep closed
    comboLock.open();
    System.out.println(comboLock); // correct combination should open
  }
}