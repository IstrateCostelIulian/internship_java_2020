package com.orange.topics.collectionsTopic;

import java.util.Objects;

public class CustomGiraffe implements Comparable<CustomGiraffe> {

    int age;
    float height;
    String color;

    public CustomGiraffe(int age, float height, String color) {
        this.age = age;
        this.height = height;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomGiraffe that = (CustomGiraffe) o;
        return age == that.age && Float.compare(that.height, height) == 0 && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, color);
    }

    @Override
    public int compareTo(CustomGiraffe o) {
        if (this.height > o.height) {
            return 1;
        } else if (o.height > this.height) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "CustomGiraffe{" +
                "age=" + age +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
