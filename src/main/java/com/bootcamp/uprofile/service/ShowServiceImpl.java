package com.bootcamp.uprofile.service;

import com.bootcamp.uprofile.dao.ShowDao;
import com.bootcamp.uprofile.domain.Show;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ShowServiceImpl implements ShowService {

    @Resource
    ShowDao showDao;

    @Override
    public List<Show> findAll() {
        return showDao.findAll();
    }

}
