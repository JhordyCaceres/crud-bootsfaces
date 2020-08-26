/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.jhordyguerra.jsf.bootfaces.service;

import java.util.ArrayList;
import java.util.List;
import pe.jhordyguerra.jsf.bootfaces.model.Person;

/**
 *
 * @author jhordycaceres
 */
public class ServPerson {

    static List<Person> persons = new ArrayList<>();

    public ServPerson() {
        init();
    }

    private void init() {
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
        this.create(new Person("73931453", "Jhordy Miguel", "Caceres Guerra", "M", "PE"));
    }

    public void create(Person p) {
        if (!persons.contains(p)) {
            persons.add(p);
        }
    }

    public void edit(Person p) {
        int size = persons.size();
        for (int i = 0; i < size; i++) {
            if (persons.get(i).equals(p)) {
                persons.set(i, p);
            }
        }
    }

    public void delete(Person p) {
        int size = persons.size();
        for (int i = 0; i < size; i++) {
            if (persons.get(i).equals(p)) {
                persons.remove(i);
            }
        }
    }

    public List<Person> all() {
        return persons;
    }
}
