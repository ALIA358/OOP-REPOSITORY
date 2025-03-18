/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregation;

/*Task 2:
Consider a composition scenario where a Person has a Brain, and the Brain cannot
exist independently without the Person.
• Create a Brain class with a method think() that prints a message.
• Create a Person class that contains a Brain object using composition.
Ensure that the Brain object is created inside the Person class, making it
dependent on the Person.
• In the main method, create a Person object and call the think() method using
the Brain object.
• Demonstrate that when the Person object is deleted, the Brain object is also
destroyed.
 */

class Brain {
    public void think() {
        System.out.println("Thinking deeply about life...");
    }
}


class Person {
    private String name;
    private Brain brain; // Composition (Person owns Brain)

    public Person(String name) {
        this.name = name;
        this.brain = new Brain(); 
    }

    public void think() {
        System.out.println(name + " is using their brain:");
        brain.think();
    }
}

// Main class
public class CompositionExample {
    public static void main(String[] args) {
        
        Person person = new Person("Alice");

        
        person.think();

        // Person object deleted, Brain is also destroyed
        person = null;
        System.out.println("\nPerson object deleted. Brain no longer exists.");
    }
}
