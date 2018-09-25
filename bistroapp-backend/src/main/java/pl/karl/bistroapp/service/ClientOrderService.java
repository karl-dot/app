package pl.karl.bistroapp.service;

import java.util.List;

import pl.karl.bistroapp.model.ClientOrder;

public interface ClientOrderService {
	
	public List<ClientOrder> getClientOrders();

	public void saveClientOrder(ClientOrder theClientOrder);

	public ClientOrder getClientOrder(String key);

	public void deleteClientOrder(String key);

}
