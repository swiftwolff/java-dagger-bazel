package atm;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {HelloWorldModule.class, LoginCommandModule.class,
  SystemOutModule.class, UserCommandsModule.class})
interface CommandRouterFactory {
  CommandRouter router();
}