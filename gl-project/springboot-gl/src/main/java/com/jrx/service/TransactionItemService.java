package com.jrx.service;

import com.jrx.model.Customer;
import com.jrx.model.TransactionItem;

import java.util.List;

/**
 * TransactionItem的service
 *
 * @author Administrator
 * @create 2019-04-15 18:38
 * @interfaceName TransactionItemService
 **/
public interface TransactionItemService {
    /**
     * @returnList<TransactionItem>
     */
    public List<TransactionItem> listTransactionItem();

    /**
     * @param tansId
     * @return TransactionItem
     */
    public TransactionItem getTransactionItem(int tansId);

    /**
     * @param transactionItem
     */
    public void updateTransactionItem(TransactionItem transactionItem);

    /**
     * @param transactionItem
     */
    public void insertTransactionItem(TransactionItem transactionItem);

    /**
     * @param tansId
     */
    public void deleteByTansId(int tansId);
}
