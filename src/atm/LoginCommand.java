package atm;

import javax.inject.Inject;
import atm.Database.Account;

final class LoginCommand extends SingleArgCommand {
    private final Outputter outputter;
    private final Database database;
  
    @Inject
    LoginCommand(Database database, Outputter outputter) {
      this.database = database;
      this.outputter = outputter;
    }
  
    // @Override
    // public String key() {
    //   return "login";
    // }
  
    @Override
    public Status handleArg(String username) {
      Account account = database.getAccount(username);
      outputter.output(
        username + " is logged in with balance: " + account.balance());
      return Status.HANDLED;
    }
  }
