package com.company.model;

/**
 * Reprezentuje salę konferencyjną.
 */
public class Room {
    private String name;
    private int capacity;

    /**
     * Tworzy nową salę konferencyjną.
     *
     * @param name     nazwa sali
     * @param capacity pojemność sali
     */
    public Room(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Zwraca nazwę sali.
     *
     * @return nazwa sali
     */
    public String getName() {
        return name;
    }

    /**
     * Zwraca pojemność sali.
     *
     * @return pojemność sali
     */
    public int getCapacity() {
        return capacity;
    }
}
