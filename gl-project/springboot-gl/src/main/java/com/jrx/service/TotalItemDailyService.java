package com.jrx.service;

import com.jrx.model.TotalItemDaily;

import java.util.List;

/**
 * TotalItemDaily的Service接口
 *
 * @author Administrator
 * @create 2019-04-15 18:32
 * @interfaceName TotalItemDailyService
 **/
public interface TotalItemDailyService {
    /**
     * @returnList<TotalItemDaily
     */
    public List<TotalItemDaily> listTotalItemDaily();

    /**
     * @param sIndex
     * @return TotalItemDaily
     */
    public TotalItemDaily getTotalItemDaily(String sIndex);

    /**
     * @param totalItemDaily
     */
    public void updateTotalItemDaily(TotalItemDaily totalItemDaily);

    /**
     * @param totalItemDaily
     */
    public void insertTotalItemDaily(TotalItemDaily totalItemDaily);

    /**
     * @param sIndex
     */
    public void deleteBySIndex(String sIndex);
}
