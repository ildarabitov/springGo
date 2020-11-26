package com.ildar.sprinlearning.serviceImpl;

import com.ildar.sprinlearning.model.AlbumDTO;
import com.ildar.sprinlearning.model.SingerDTO;
import com.ildar.sprinlearning.repository.AlbumRepository;
import com.ildar.sprinlearning.repository.SingerRepository;
import com.ildar.sprinlearning.service.GrammyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GrammyServiceImpl/* implements GrammyService*/ {
//    @Autowired
//    SingerRepository singerRepository;
//    @Autowired
//    AlbumRepository albumRepository;
//    @Override
//    public List<SingerDTO> getAllSingers() {
//        return singerRepository.findAll();
//    }
//
//    @Override
//    public String addSinger(SingerDTO singerDTO) {
//        if (singerDTO.getId()>0&& singerDTO.getId()<=10){
//            List<SingerDTO> singerDTOS =singerRepository.findAll();
//            if (!singerDTOS.isEmpty()) {
//                for (SingerDTO singerDTO1 : singerDTOS)
//                    if (singerDTO1.getId() != singerDTO.getId()) {
//                        singerRepository.save(singerDTO);
//                    }
//            }else singerRepository.save(singerDTO);
//        }else return "Sorry failure";
//
//       return "Operation save Singer complete";
//
//    }
//
//    @Override
//    public String addAlbum(AlbumDTO albumDTO) {
//        if (albumDTO.getId()>0&&albumDTO.getId()<=10){
//            List<AlbumDTO>albumDTOS=albumRepository.findAll();
//            for (AlbumDTO albumDTO1:albumDTOS)
//                if (albumDTO1.getId()!=albumDTO.getId()){
//                    albumRepository.save(albumDTO);
//                }
//        }else return "Sorry failure";
//
//        return "Operation save Album complete";
//    }
}
