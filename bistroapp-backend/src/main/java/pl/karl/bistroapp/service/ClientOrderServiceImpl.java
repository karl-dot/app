package pl.karl.bistroapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.karl.bistroapp.dao.ClientOrderDAO;
import pl.karl.bistroapp.model.ClientOrder;

@Service
public class ClientOrderServiceImpl implements ClientOrderService {

	@Autowired
	private ClientOrderDAO clientOrderDAO;
	
	@Transactional
	public List<ClientOrder> getClientOrders() {
		// TODO Auto-generated method stub
		return clientOrderDAO.getClientOrders();
	}

	public void saveClientOrder(ClientOrder theClientOrder) {
		// TODO Auto-generated method stub
		
	}

	public ClientOrder getClientOrder(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteClientOrder(String key) {
		// TODO Auto-generated method stub
		
	}

}
