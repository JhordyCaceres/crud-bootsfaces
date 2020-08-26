package pe.jhordyguerra.jsf.bootfaces.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import pe.jhordyguerra.jsf.bootfaces.model.Person;
import pe.jhordyguerra.jsf.bootfaces.service.ServPerson;

/**
 *
 * @author jhordycaceres
 */
@Named(value = "beanPerson")
@SessionScoped
public class BeanPerson implements Serializable {

    ServPerson dao = new ServPerson();
    private Person person = new Person();
    List<Person> persons = null;

    public void create() {
        dao.create(person);
    }

    public void delete() {
        dao.delete(person);

    }

    public void edit() {
        dao.edit(person);

    }

    public List<Person> getPersons() {
        if (this.persons == null) {
            this.persons = dao.all();
        }
        return this.persons;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
}
