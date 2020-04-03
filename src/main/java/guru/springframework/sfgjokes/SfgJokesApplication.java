package guru.springframework.sfgjokes;

import guru.springframework.sfgjokes.services.FetchJokeImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgJokesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgJokesApplication.class, args);
		FetchJokeImpl fetchJokeImpl = (FetchJokeImpl) ctx.getBean("fetchJokeImpl");
		System.out.println(fetchJokeImpl.getJoke());
		System.out.println(fetchJokeImpl.getJoke());
		System.out.println(fetchJokeImpl.getJoke());

	}

}
