package pl.karl.bistroapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.karl.bistroapp.model.ClientOrder;
import pl.karl.bistroapp.service.ClientOrderService;

@RestController
@RequestMapping("/api")
public class ClientOrderController {
	
	@Autowired
	private ClientOrderService clientOrderService;
	
	@GetMapping("/clientOrders")
	public List<ClientOrder> getClientOrders() {
		
		return clientOrderService.getClientOrders();
	}

}
