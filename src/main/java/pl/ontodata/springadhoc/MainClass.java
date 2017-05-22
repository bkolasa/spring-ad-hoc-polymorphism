package pl.ontodata.springadhoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

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
        System.out.println(intUtil.sum(Arrays.asList(1,2,3,4), (Class<Integer>) Integer.valueOf(1).getClass()));
        System.out.println(intUtil.sum(Arrays.asList("a","b","c"), String.class));
//        System.out.println(intUtil.sum(Arrays.asList(1d), Double.class));
    }
}
