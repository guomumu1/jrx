package com.jrx.service.impl;

import com.jrx.model.TotalItemDaily;
import com.jrx.repository.TotalItemDailyMapper;
import com.jrx.service.TotalItemDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TotalItemDaily的Service接口实现类
 *
 * @author Administrator
 * @create 2019-04-15 18:32
 * @className TotalItemDailyServiceImpl
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class TotalItemDailyServiceImpl implements TotalItemDailyService{
    @Autowired
    private TotalItemDailyMapper totalItemDailyMapper;


    @Override
    public List<TotalItemDaily> listTotalItemDaily() {
        return totalItemDailyMapper.selectByExample(null);
    }

    @Override
    public TotalItemDaily getTotalItemDaily(String sIndex) {
        return totalItemDailyMapper.selectByPrimaryKey(sIndex);
    }

    @Override
    public void updateTotalItemDaily(TotalItemDaily totalItemDaily) {
        totalItemDailyMapper.updateByPrimaryKeySelective(totalItemDaily);
    }

    @Override
    public void insertTotalItemDaily(TotalItemDaily totalItemDaily) {
        totalItemDailyMapper.insertSelective(totalItemDaily);
    }

    @Override
    public void deleteBySIndex(String sIndex) {
        totalItemDailyMapper.deleteByPrimaryKey(sIndex);
    }
}
