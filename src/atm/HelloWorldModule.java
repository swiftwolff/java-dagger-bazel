package atm;
import dagger.Module;
import dagger.Binds;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
abstract class HelloWorldModule {
  @Binds
  @IntoMap
  @StringKey("hello")
  abstract Command helloWorldCommand(HelloWorldCommand command);
}