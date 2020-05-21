package kr.co.fastcampus.eatgo;

import kr.co.fastcampus.eatgo.domain.Restaurant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EatgoApplicationTests {

	@Test
	public void creation() {
		Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");

		assertEquals("Bob zip", restaurant.getName());
		assertEquals("Seoul", restaurant.getAddress());
	}

	@Test
	public void information() {
		Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");

		assertEquals("Bob zip in Seoul", restaurant.getInformation());
	}
}
