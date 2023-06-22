package com.example.OneToOneRelationshipApplicationHB1.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class PersonTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Person}
     *   <li>{@link Person#setAdderss(String)}
     *   <li>{@link Person#setAdharCard(AdharCard)}
     *   <li>{@link Person#setAdharcardId(int)}
     *   <li>{@link Person#setEmail(String)}
     *   <li>{@link Person#setMobile(String)}
     *   <li>{@link Person#setPincode(String)}
     *   <li>{@link Person#getAdderss()}
     *   <li>{@link Person#getAdharCard()}
     *   <li>{@link Person#getAdharcardId()}
     *   <li>{@link Person#getEmail()}
     *   <li>{@link Person#getMobile()}
     *   <li>{@link Person#getPincode()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Person actualPerson = new Person();
        actualPerson.setAdderss("Adderss");
        AdharCard adharCard = new AdharCard();
        adharCard.setAdharcardId(1);
        adharCard.setAgency("Agency");
        adharCard.setIssueTime("Issue Time");
        adharCard.setType("Type");
        actualPerson.setAdharCard(adharCard);
        actualPerson.setAdharcardId(1);
        actualPerson.setEmail("jane.doe@example.org");
        actualPerson.setMobile("Mobile");
        actualPerson.setPincode("Pincode");
        assertEquals("Adderss", actualPerson.getAdderss());
        assertSame(adharCard, actualPerson.getAdharCard());
        assertEquals(1, actualPerson.getAdharcardId());
        assertEquals("jane.doe@example.org", actualPerson.getEmail());
        assertEquals("Mobile", actualPerson.getMobile());
        assertEquals("Pincode", actualPerson.getPincode());
    }
}

