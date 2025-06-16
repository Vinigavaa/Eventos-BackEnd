package com.eventos.tec.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestDTO(String title, String description, MultipartFile img_url, String event_url,
                              boolean remote, Date date) {
}
