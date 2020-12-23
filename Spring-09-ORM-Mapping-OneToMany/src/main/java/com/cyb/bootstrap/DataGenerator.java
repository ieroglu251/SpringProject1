package com.cyb.bootstrap;

import com.cyb.entity.Address;
import com.cyb.entity.Person;
import com.cyb.repository.AddressRepository;
import com.cyb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;



    @Override
    public void run(String... args) throws Exception {

        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("mike", "smith");
        Person p2 = new Person("miken", "smitht");
        Person p3 = new Person("mikes", "smithh");

        Address a1 = new Address("king st","4567");
        Address a2 = new Address("king st1","45671");
        Address a3 = new Address("king st2","45672");

//        p1.setAddresses(Arrays.asList(a1,a2));    // case 1

        personRepository.save(p1);
        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);


        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);




    }
}
