package com.ethical_techniques.notemaker.note;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

/**
 * A user defined category for logically grouping of Notes.
 * <p>
 * If Category.id is equal to -5 than the Category has not saved in persistent memory.
 */
public class Category {

    public static final int NONE = -5;
    public static final String NONE_NAME = "Categories";
    public static final int NON_COLOR = Color.LTGRAY;

    private static final Category DEPHAULT;


    static {
        DEPHAULT = new Category(NONE, NONE_NAME, NON_COLOR);
    }

    private int id;
    private String name;
    private int color;

    public Category() {
        id = NONE;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Category(int id, String name, int color) {
        this(id, name);
        this.color = color;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public static Category getDEPHAULT() {
        return DEPHAULT;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id &&
                name.equals(category.name) &&
                color == category.color;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(id, name, color);
    }
}