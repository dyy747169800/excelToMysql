package com.uban.dao;

import com.uban.entity.InfoVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DuanYangYu on 2017/5/26 0026.
 */
@Repository
public interface InfoDao {
    void batchInsert(List<InfoVo> infoVoList);
}
