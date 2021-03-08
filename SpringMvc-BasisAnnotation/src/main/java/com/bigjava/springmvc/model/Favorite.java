package com.bigjava.springmvc.model;

import java.util.List;

/**
 * @Author zgp
 * @Since 2021 -03 -08 10 :57
 * @Description
 */
public class Favorite {

    public List<String> favorite;

    public List<String> getFavorite() {
        return favorite;
    }

    public void setFavorite(List<String> favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "favorite=" + favorite +
                '}';
    }
}
