package com.eventos.tec.Service;

import com.eventos.tec.domain.event.Event;
import com.eventos.tec.domain.event.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {
    public Event createEvent(EventRequestDTO data){
        String imgUrl = null;

        if(data.img_url() != null){
           imgUrl = this.uploadImg(data.img_url());
        }

        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.event_url());
        newEvent.setRemote(data.remote());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImgUrl(imgUrl);

        return newEvent;
    }

    private String uploadImg(MultipartFile multipartFile){
        return "";
    }
}
