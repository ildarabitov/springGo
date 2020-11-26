package com.ildar.sprinlearning.service;

import com.ildar.sprinlearning.model.AlbumDTO;
import com.ildar.sprinlearning.model.SingerDTO;

import java.util.List;

public interface GrammyService {
List<SingerDTO>getAllSingers();
String addSinger(SingerDTO singerDTO);
    String addAlbum(AlbumDTO albumDTO);
}
