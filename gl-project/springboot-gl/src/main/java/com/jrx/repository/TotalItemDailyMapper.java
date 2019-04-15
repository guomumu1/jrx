package com.jrx.repository;

import com.jrx.model.TotalItemDaily;
import com.jrx.model.TotalItemDailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalItemDailyMapper {
    long countByExample(TotalItemDailyExample example);

    int deleteByExample(TotalItemDailyExample example);

    int deleteByPrimaryKey(String sIndex);

    int insert(TotalItemDaily record);

    int insertSelective(TotalItemDaily record);

    List<TotalItemDaily> selectByExample(TotalItemDailyExample example);

    TotalItemDaily selectByPrimaryKey(String sIndex);

    int updateByExampleSelective(@Param("record") TotalItemDaily record, @Param("example") TotalItemDailyExample example);

    int updateByExample(@Param("record") TotalItemDaily record, @Param("example") TotalItemDailyExample example);

    int updateByPrimaryKeySelective(TotalItemDaily record);

    int updateByPrimaryKey(TotalItemDaily record);
}