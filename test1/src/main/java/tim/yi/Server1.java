package tim.yi;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * @author T1m Zhang(49244143@qq.com) 2020/4/7.
 */
@EnableEurekaServer
@SpringBootApplication
public class Server1 {

    public static void main(String[] args) {


        SpringApplication.run(Server1.class, args);
    }

}
