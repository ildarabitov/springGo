package com.ildar.sprinlearning.model;

import lombok.Data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Data
public class SingerDTO {
    private Long id;
    private String firstName;
    private String lastName;



    private Date birthDate;
    public void setBirthDate(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);


        Date date = formatter.parse(birthDate);
        this.birthDate = date;
    }
//    private List<AlbumDTO> albumDTO;


//    public boolean addAЬum(AlbumDTO albumDTO) {
//        if (this.albumDTO == null) {
//            this.albumDTO = new ArrayList<>();
//            this.albumDTO.add(albumDTO);
//            return true;
//        } else {
//            if (this.albumDTO.contains(albumDTO)) {
//                return false;
//            }
//        }
//        this.albumDTO.add(albumDTO);
//        return true;
//    }

    public String toString () {
        return "Singer - Id: " + id + ", First name: "
                + firstName + ", Last name: " + lastName + ", Birthday: " + birthDate;
    }
    }
