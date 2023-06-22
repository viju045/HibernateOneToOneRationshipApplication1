package com.example.OneToOneRelationshipApplicationHB1;

import com.example.OneToOneRelationshipApplicationHB1.model.AdharCard;
import com.example.OneToOneRelationshipApplicationHB1.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class OneToOneRelationshipApplicationHb1Application {

	public static void main(String[] args) {

		StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metadata =new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction txs = session.beginTransaction();

		Person person = new Person();
		person.setAdderss("pune");
		person.setEmail("abc@gmail.com");
		person.setPincode("416411");
		person.setMobile("9078563412");

		AdharCard adharCard = new AdharCard();
		adharCard.setAgency("IndiaGov");
		adharCard.setIssueTime("2013");
		adharCard.setType("child");

		person.setAdharCard(adharCard);
		adharCard.setPerson(person);

		session.persist(person);
		txs.commit();

		session.close();
		System.out.println("Successful Done");

	}

}
