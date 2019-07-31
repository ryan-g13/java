import java.math.BigDecimal;

public class account 
{

  String accountNumber;
  String firstName;
  String lastName;
  String address;
  String email;
  String password;
  BigDecimal initialDeposit;

  // Account number - String
  // Firstname, last Name, address 
  // initial deposit - bigDecimal
  // email - string 
  // password - string

  /* ----------------------------------- 
  Class Methods:
  // -----------------------------------
  */
  // deposit 
  // public BigDecimal deposit(BigDecimal depositValue) {
  //   BigDecimal balance = 0;
  //   balance = balance + depositValue;
  //   return balance;
  // }
  public Double deposit(Double depositValue) {
    Double balance = 0;
    balance = balance + depositValue;
    return balance;
  }
  // withdraw
  public BigDecimal withdraw(BigDecimal withdrawValue) {
    BigDecimal balance;
    balance = balance + depositValue;
    return balance;
  }
  // check balance
  public BigDecimal checkBalance() {
    return balance;
  }
}