package com.uban.service;

import com.uban.dao.InfoDao;
import com.uban.entity.InfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DuanYangYu on 2017/6/2 0002.
 */
@Service
public class InfoService {
    @Autowired
    private InfoDao infoDao;

    public void batchInsert(List<InfoVo> infoVoList){
        infoDao.batchInsert(infoVoList);
    }
}
