package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {


		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282,800.00,10.0);
		Order order3 = new Order(1309,95.90,0.0);

		List<Order> orders = new ArrayList<>();


		orders.add(order1);
		orders.add(order2);
		orders.add(order3);

		for (Order order : orders) {
			System.out.println("\nPedido código" + order.getCode());
			System.out.println("Valor total: " + orderService.total(order));
		};
	}


}
