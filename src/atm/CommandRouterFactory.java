package atm;
import dagger.Component;

@Component
interface CommandRouterFactory {
  CommandRouter router();
}