package com.stream.app.services;

import com.stream.app.entities.Video;
import org.springframework.web.multipart.MultipartFile;

public interface VideoService {

    //save video
    Video save(Video video, MultipartFile File);

    //get video by id
    Video get(String videoId);

    //get video by title
    Video getByTitle(String title);

    List<Video> getAll();

}
