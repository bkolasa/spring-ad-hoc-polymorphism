package pl.ontodata.springadhoc;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import pl.ontodata.springadhoc.adhoc.SumUtil;
import pl.ontodata.springadhoc.adhoc.model.Point;

@SpringBootApplication
public class MainClass {

    @Autowired
    private SumUtil intUtil;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(MainClass.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

        MainClass app = context.getBean(MainClass.class);
        app.start();
    }

    private void start() {
        System.out.println(intUtil.sum(Arrays.asList(1, 2, 3, 4), (Class<Integer>) Integer.valueOf(1).getClass()));
        System.out.println(intUtil.sum(Arrays.asList("a", "b", "c"), String.class));
        System.out.println(intUtil.sum(Arrays.asList(new Point(1, 2), new Point(3, 4)), Point.class));
    }
}
