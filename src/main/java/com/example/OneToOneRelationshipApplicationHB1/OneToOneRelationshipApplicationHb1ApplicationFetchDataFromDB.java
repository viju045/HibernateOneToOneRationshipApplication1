package com.example.OneToOneRelationshipApplicationHB1;

import com.example.OneToOneRelationshipApplicationHB1.model.AdharCard;
import com.example.OneToOneRelationshipApplicationHB1.model.Person;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;

public class OneToOneRelationshipApplicationHb1ApplicationFetchDataFromDB {
    public static void main(String args[]){
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata =new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction txs = session.beginTransaction();

        TypedQuery query = session.createQuery("from Person person");
        List<Person> list = query.getResultList();
        Iterator<Person>iterator = list.listIterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.getAdderss()+""+person.getEmail()+""+person.getMobile()+""+person.getPincode());

            AdharCard adharCard = person.getAdharCard();

            System.out.println(adharCard.getAgency()+""+adharCard.getType()+""+adharCard.getIssueTime());
        }
        session.close();
        System.out.println("Data has been retrive successufully");
    }
}
