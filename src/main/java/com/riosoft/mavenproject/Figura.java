/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riosoft.mavenproject;

/**
 *
 * @author ricardo
 */
public class Figura {

    protected String shape;
    protected String color;
    protected Coordinates coords;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coordinates getCoords() {
        return coords;
    }

    public void setCoords(Coordinates coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return "Figura{" + "shape=" + shape + ", color=" + color + ", coords=" + coords + '}';
    }

}
