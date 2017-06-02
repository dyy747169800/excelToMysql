package com.uban.test;

import com.uban.entity.InfoVo;
import com.uban.service.InfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuanYangYu on 2017/6/2 0002.
 */
//使用指定的单元测试类
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
//指定spring文件的位置
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

//执行完操作回滚
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class InfoVoServiceTest {
    @Autowired
    private InfoService infoService;

    @Test
    public void test01(){
        List<InfoVo> infoVos = new ArrayList<InfoVo>();
        infoVos.add(new InfoVo("1001","xiaoming","2017-11-25","1000"));
        infoVos.add(new InfoVo("1002","xiaoming2","2017-11-22","2000"));
        infoVos.add(new InfoVo("1003","xiaoming3","2017-11-23","3000"));
        infoService.batchInsert(infoVos);
    }
}
