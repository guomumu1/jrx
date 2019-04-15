package com.jrx.batch.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionItem {
    private Integer transId;

    private Integer custId;

    private String account;

    private String cardNbr;

    private Integer tranno;

    private Integer monthNbr;

    private BigDecimal bill;

    private String transType;

    private Date txnDatetime;

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr == null ? null : cardNbr.trim();
    }

    public Integer getTranno() {
        return tranno;
    }

    public void setTranno(Integer tranno) {
        this.tranno = tranno;
    }

    public Integer getMonthNbr() {
        return monthNbr;
    }

    public void setMonthNbr(Integer monthNbr) {
        this.monthNbr = monthNbr;
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        this.bill = bill;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public Date getTxnDatetime() {
        return txnDatetime;
    }

    public void setTxnDatetime(Date txnDatetime) {
        this.txnDatetime = txnDatetime;
    }
}