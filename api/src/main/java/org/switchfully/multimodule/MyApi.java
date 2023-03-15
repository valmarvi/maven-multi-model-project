package org.switchfully.multimodule;

import com.google.common.collect.Lists;

import java.util.List;

public class MyApi {
    public static void main(String[] args) {
        Person person1 = new Person("Josh");
        Person person2 = new Person("Peter");

        List<Person> persons = Lists.newArrayList(person1, person2);

        persons.forEach(person -> System.out.println(person.getName()));

    }
}
