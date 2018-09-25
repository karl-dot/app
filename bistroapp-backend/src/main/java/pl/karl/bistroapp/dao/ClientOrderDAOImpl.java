package pl.karl.bistroapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.karl.bistroapp.model.ClientOrder;

@Repository
public class ClientOrderDAOImpl implements ClientOrderDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<ClientOrder> getClientOrders() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<ClientOrder> theQuery = session.createQuery("from ClientOrder", ClientOrder.class);
		
		List<ClientOrder> clientOrders = theQuery.getResultList();
		
		return clientOrders;
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
