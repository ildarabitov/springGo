package com.ildar.sprinlearning.controller;

import com.ildar.sprinlearning.model.AlbumDTO;
import com.ildar.sprinlearning.model.SingerDTO;
import com.ildar.sprinlearning.serviceImpl.GrammyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GrammyController {
//    @Autowired
//    GrammyServiceImpl grammyService;
//    @GetMapping("/singers")
//    public List<SingerDTO> getAllSingers(){
//       return grammyService.getAllSingers();
//    }
//    @PostMapping("/addSinger")
//    public String addSinger(SingerDTO singerDTO){
//        return grammyService.addSinger(singerDTO);
//    }
//    @PostMapping("/addAlbum")
//    public String addAlbum(AlbumDTO albumDTO){
//        return grammyService.addAlbum(albumDTO);
//    }
    @GetMapping("/main")
    public String getMain(){
        return "its Main page";
    }
}
