package com.jrx.batch;

import com.jrx.batch.pojo.Customer;
import com.jrx.batch.pojo.TransactionItem;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 执行JOB
 *
 * @author Administrator
 * @create 2019-04-15 18:01
 * @className StartJob
 **/
@Configuration
public class StartJob {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private FlatFileItemReader<Customer> readerCustomer;

    @Autowired
    private JdbcBatchItemWriter<Customer> writerSqlCustomer1;

    @Autowired
    private FlatFileItemReader<TransactionItem> readerTransactionItem;

    @Autowired
    private JdbcBatchItemWriter<TransactionItem> writerSqlTransactionItem1;
    @Bean
    public Job getJob(){
        return jobBuilderFactory
                .get("job12")
                .start(step1())
                .next(step2())
                .build();
    }

    private Step step2() {
        return stepBuilderFactory
                .get("stepCustomer")
                .<Customer,Customer>chunk(10)
                .reader(readerCustomer)
                .writer(writerSqlCustomer1)
                .build();
    }

    private Step step1() {
        return stepBuilderFactory
                .get("stepTransactionItem")
                .<TransactionItem,TransactionItem>chunk(10)
                .reader(readerTransactionItem)
                .writer(writerSqlTransactionItem1)
                .build();
    }
}
