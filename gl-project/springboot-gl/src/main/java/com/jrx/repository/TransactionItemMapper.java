package com.jrx.repository;

import com.jrx.model.TransactionItem;
import com.jrx.model.TransactionItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionItemMapper {
    long countByExample(TransactionItemExample example);

    int deleteByExample(TransactionItemExample example);

    int deleteByPrimaryKey(Integer transId);

    int insert(TransactionItem record);

    int insertSelective(TransactionItem record);

    List<TransactionItem> selectByExample(TransactionItemExample example);

    TransactionItem selectByPrimaryKey(Integer transId);

    int updateByExampleSelective(@Param("record") TransactionItem record, @Param("example") TransactionItemExample example);

    int updateByExample(@Param("record") TransactionItem record, @Param("example") TransactionItemExample example);

    int updateByPrimaryKeySelective(TransactionItem record);

    int updateByPrimaryKey(TransactionItem record);
}