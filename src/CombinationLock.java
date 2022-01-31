import java.util.Scanner;

/**
 * CombinationLock.java
 *
 * Sub class of Lock, extends Lock class.
 * This is an example to show off inheritance
 *
 * @author axu5 <github.com/axu5>
 * @version 27.01.2022
 */
public class CombinationLock extends Lock {
  private String combination;
  private Scanner sc = new Scanner(System.in);

  CombinationLock() {
    // call superclass constructor
    super();
    // deal with the specificities of CombinationLock
    // open the lock so a new combination can be set later
    super.open();
  }

  CombinationLock(String combination) {
    // call superclass constructor
    super();
    // set the combination to the combination parameter
    this.combination = combination;
  }

  // set the combination only when the lock is unlocked
  public void setCombination(String combination) {
    if (!this.locked)
      this.combination = combination;
  }

  // return the combination only when the lock is unlocked
  public String getCombination() {
    if (!this.locked)
      return this.combination;
    return "YOU SHALL NOT PASS";
  }

  public String toString() {
    return super.toString();
  }

  public void open(String combinationAttempt) {
    if (combinationAttempt.equals(combination))
      super.open();
  }

  // override the open method from Lock superclass, should not open the lock with
  // no String parameter unlike behaviour from Lock class
  @Override
  public void open() {
    System.out.println("Enter the combination >");
    String attempt = sc.nextLine();

    this.open(attempt);
  }
}