package com.bigjava.springmvc.model;

/**
 * @Author zgp
 * @Since 2021 -03 -08 11 :33
 * @Description
 */
public class Student {

    private Favorite favorite;

    @Override
    public String toString() {
        return "Student{" +
                "favorite=" + favorite +
                '}';
    }

    public Favorite getFavorite() {
        return favorite;
    }

    public void setFavorite(Favorite favorite) {
        this.favorite = favorite;
    }

}
