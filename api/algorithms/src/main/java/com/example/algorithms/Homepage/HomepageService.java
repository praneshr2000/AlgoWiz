package com.example.algorithms.Homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomepageService {
    private final HomepageRepository homepageRepository;

    @Autowired
    public HomepageService(HomepageRepository homepageRepository) {
        this.homepageRepository = homepageRepository;
    }


    public List<HomepageTopics> getTopics() {
        return homepageRepository.findAll();


    }
}
