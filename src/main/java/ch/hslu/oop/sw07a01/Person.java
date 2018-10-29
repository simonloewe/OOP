/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07a01;

import java.util.Objects;

/**
 *
 * @author lion
 */
public class Person {

    final long id;
    String name;
    String surname;
    
    public Person(final long id, String Name, String Surname){
        this.id = id;
        this.name = Name;
        this.surname = Surname; 
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("true");
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }
    
    public long getPersonID(){
        return id;
    }
    
    public String getPersonName(){
        return name;
    }
    
    public String getPersonSurname(){
        return surname;
    }
    
    public void setPersonName(){
        this.name = name;
    }
    
    public void setPersonSurname(){
        this.surname = surname;
    }
    
    //Dies hilft uns die abfrage direkt zu machen und erleichter später das logen in files
    @Override
    public String toString(){
        return this.id + " | " + this.name + " | " + this.surname; 
    }
}
