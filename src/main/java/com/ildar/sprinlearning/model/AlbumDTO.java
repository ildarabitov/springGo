package com.ildar.sprinlearning.model;

import lombok.Builder;
import lombok.Data;


import java.util.Date;
@Data
public class AlbumDTO {
    private Long id;
    private Long singerId;
    private String title;
    private Date releaseDate;

    public String toString () {
        return "Album - Id: " + id + ", Singer id: " + singerId + ", Title: " + title
                + ", Release Date: " + releaseDate;
    }
}
