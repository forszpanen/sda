package com.sda.mediator;

import java.util.ArrayList;

public class ApplicationMediator implements Mediator {
    private ArrayList<Person> people;

    public ApplicationMediator() {
        people = new ArrayList<Person>();
    }

    public void addColleague(Person person) {
        people.add(person);
    }

    public void send(String message, Person originator) {
        //let all other screens know that this screen has changed
        for (Person person : people) {
            //don't tell ourselves
            if (person != originator) {
                person.receive(message);
            }
        }
    }
}