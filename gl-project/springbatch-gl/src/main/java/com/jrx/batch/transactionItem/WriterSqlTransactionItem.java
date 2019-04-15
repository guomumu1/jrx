package com.jrx.batch.transactionItem;

import com.jrx.batch.pojo.Customer;
import com.jrx.batch.pojo.TransactionItem;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 将数据写到数据库
 *
 * @author Administrator
 * @create 2019-04-15 18:20
 * @className WriterSqlTransactionItem
 **/
@Configuration
public class WriterSqlTransactionItem {
    @Autowired
    private HikariDataSource dataSource;
    @Bean
    public JdbcBatchItemWriter<TransactionItem> writerSqlTransactionItem1(){
        //创建jdbcBatchItemWriter对象进行数据写进数据库的操作
        JdbcBatchItemWriter<TransactionItem> jdbcBatchItemWriter = new JdbcBatchItemWriter();
        jdbcBatchItemWriter.setDataSource(dataSource);
        //注入数据源
        jdbcBatchItemWriter.setSql("insert into transaction_item_table(trans_id,cust_id,account,card_nbr,tranno,month_nbr,bill,trans_type,txn_datetime)values"
                + "(:transId,:custId,:account,:cardNbr,:tranno,:monthNbr,:bill,:transType,:txnDatetime)");
        //设置SQL语句
        jdbcBatchItemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider());
        //将配置装进容器中
        return jdbcBatchItemWriter;
    }
}
