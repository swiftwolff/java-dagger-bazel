package atm;

import dagger.Module;
import dagger.Binds;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
abstract class LoginCommandModule {
  @Binds
  @IntoMap
  @StringKey("login")
  abstract Command loginCommand(LoginCommand command);
}
