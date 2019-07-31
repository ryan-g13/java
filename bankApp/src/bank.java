public class bank 
{


  public static void main(String[] args) {
    
  }

  /* ----------------------------------- 
  Class Methods:
  // -----------------------------------
  */

  // Add account
  public Object addAccount(Object construction) {
    return construction;
  }
  // remove account
  public String removeAccount() {
    return "Your account has been removed from the system.";
  }
  // login
  public Object login(Object loginInfo) {
    return loginInfo;
  }

  // Data needed for a bank account
  // Account number - String
  // Firstname, last Name, address 
  // initial deposit - bigDecimal
  // email - string 
  // password - string
  
  // Future features: 
  // 1. Read / Write from a file as DB
  // 2. CLI login prompt for user - user flows for creating new account if not in db
  // 3. Close account and return balance to the user.

}