/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slawo
 */
public class Gift {

    // pola
    private String name;
    private int weight;

    // konstruktor
    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // metody
    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + "( " + this.weight + "kg)";
    }
}
