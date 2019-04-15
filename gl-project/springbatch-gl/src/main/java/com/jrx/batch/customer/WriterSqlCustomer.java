package com.jrx.batch.customer;

import com.jrx.batch.pojo.Customer;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 将数据写到sql数据库
 *
 * @author Administrator
 * @create 2019-04-15 18:07
 * @className WriterSqlCustomer
 **/
@Configuration
public class WriterSqlCustomer {
    @Autowired
    private HikariDataSource dataSource;
    @Bean
    public JdbcBatchItemWriter<Customer> writerSqlCustomer1(){
        //创建jdbcBatchItemWriter对象进行数据写进数据库的操作
        JdbcBatchItemWriter<Customer> jdbcBatchItemWriter=new JdbcBatchItemWriter();
        jdbcBatchItemWriter.setDataSource(dataSource);
        //注入数据源
        jdbcBatchItemWriter.setSql("insert into customer_table(cust_id,surname,gender,educa_des,mar_des,birthday,address)values"
                +"(:custId,:surname,:gender,:educaDes,:marDes,:birthday,:address)");
        //设置SQL语句
        jdbcBatchItemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider());
        //将配置装进容器中
        return jdbcBatchItemWriter;

    }
}
