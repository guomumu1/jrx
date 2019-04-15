package com.jrx.service.impl;

import com.jrx.model.TransactionItem;
import com.jrx.repository.TransactionItemMapper;
import com.jrx.service.TransactionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TransactionItem的service的实现类
 *
 * @author Administrator
 * @create 2019-04-15 18:38
 * @className TransactionItemServiceImpl
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class TransactionItemServiceImpl implements TransactionItemService{
    @Autowired
    private TransactionItemMapper transactionItemMapper;

    @Override
    public List<TransactionItem> listTransactionItem() {
        return transactionItemMapper.selectByExample(null);
    }

    @Override
    public TransactionItem getTransactionItem(int tansId) {
        return transactionItemMapper.selectByPrimaryKey(tansId);
    }

    @Override
    public void updateTransactionItem(TransactionItem transactionItem) {
        transactionItemMapper.updateByPrimaryKeySelective(transactionItem);
    }

    @Override
    public void insertTransactionItem(TransactionItem transactionItem) {
        transactionItemMapper.insertSelective(transactionItem);
    }

    @Override
    public void deleteByTansId(int tansId) {
        transactionItemMapper.deleteByPrimaryKey(tansId);
    }
}
