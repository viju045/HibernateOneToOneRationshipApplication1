package com.example.OneToOneRelationshipApplicationHB1.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdharCardTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link AdharCard}
     *   <li>{@link AdharCard#setAdharcardId(int)}
     *   <li>{@link AdharCard#setAgency(String)}
     *   <li>{@link AdharCard#setIssueTime(String)}
     *   <li>{@link AdharCard#setType(String)}
     *   <li>{@link AdharCard#setPerson(Person)}
     *   <li>{@link AdharCard#getAdharcardId()}
     *   <li>{@link AdharCard#getAgency()}
     *   <li>{@link AdharCard#getIssueTime()}
     *   <li>{@link AdharCard#getType()}
     * </ul>
     */
    @Test
    void testConstructor() {
        AdharCard actualAdharCard = new AdharCard();
        actualAdharCard.setAdharcardId(1);
        actualAdharCard.setAgency("Agency");
        actualAdharCard.setIssueTime("Issue Time");
        actualAdharCard.setType("Type");
        AdharCard adharCard = new AdharCard();
        adharCard.setAdharcardId(1);
        adharCard.setAgency("Agency");
        adharCard.setIssueTime("Issue Time");
        adharCard.setType("Type");
        Person person = new Person();
        person.setAdderss("Adderss");
        person.setAdharCard(adharCard);
        person.setAdharcardId(1);
        person.setEmail("jane.doe@example.org");
        person.setMobile("Mobile");
        person.setPincode("Pincode");
        actualAdharCard.setPerson(person);
        assertEquals(1, actualAdharCard.getAdharcardId());
        assertEquals("Agency", actualAdharCard.getAgency());
        assertEquals("Issue Time", actualAdharCard.getIssueTime());
        assertEquals("Type", actualAdharCard.getType());
    }
}

