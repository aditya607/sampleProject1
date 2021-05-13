import com.raja.demo1.config.Config;
import com.raja.demo1.resource.AgentResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class Demo1Application extends Application<Config> {

    public static void main(String[] args) throws Exception {
        System.out.println("raja");
        new Demo1Application().run(args);
    }
    @Override
    public void run(Config configuration, Environment environment) throws Exception {

        AgentResource agent= new AgentResource();
        environment.jersey().register(agent);

    }
}
