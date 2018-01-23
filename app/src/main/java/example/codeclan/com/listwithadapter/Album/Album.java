package example.codeclan.com.listwithadapter.Album;

import java.time.LocalDate;

/**
 * Created by horizon on 23/01/2018.
 */

public class Album {

    private String title;
    private LocalDate releaseDate;
    private String image;
    private Boolean stillProduce;

    public Album(String title, LocalDate releaseDate, String image, Boolean stillProduce){
        this.title          = title;
        this.releaseDate    = releaseDate;
        this.image          = image;
        this.stillProduce   = stillProduce;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getStillProduce() {
        return stillProduce;
    }

    public void setStillProduce(Boolean stillProduce) {
        this.stillProduce = stillProduce;
    }
}
