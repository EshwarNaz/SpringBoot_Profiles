package in.eshwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.eshwar.entity.Bikes;
import in.eshwar.repo.BikeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		BikeRepository bean = ctxt.getBean(BikeRepository.class);
		Bikes b = new Bikes();
		b.setBike_id(350);
		b.setBike_name("Bullet");
		bean.save(b);

	}

}
