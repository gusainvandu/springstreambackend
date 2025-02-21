package com.stream.app.services.impl;

import com.stream.app.entities.Video;
import com.stream.app.services.VideoService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public Video save(Video video, MultipartFile File) {

        //folder path : create

        //folder path with filename

        //copy file to the folder

        //video metadata

        //metadata save
        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return null;
    }
}
