package com.jrx.batch.transactionItem;

import com.jrx.batch.pojo.Customer;
import com.jrx.batch.pojo.TransactionItem;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * 读取文件transactionItem
 *
 * @author Administrator
 * @create 2019-04-15 18:19
 * @className FileReaderTransactionItem
 **/
@Configuration
public class FileReaderTransactionItem {
    @Bean
    public FlatFileItemReader<TransactionItem> readerTransactionItem(){

        FlatFileItemReader<TransactionItem> flatFileItemReader = new FlatFileItemReader<TransactionItem>();
        //读取的文件
        flatFileItemReader.setResource(new ClassPathResource("traincationdetil.txt"));
        //跳过第一行
        flatFileItemReader.setLinesToSkip(1);

        //解析数据
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        //每行的意思
        delimitedLineTokenizer.setNames(new String[]{"trans_id", "cust_id", "account", "card_nbr", "tranno", "month_nbr", "bill","trans_type","txn_datetime"});
        delimitedLineTokenizer.setDelimiter(",");
        //映射对象
        DefaultLineMapper<TransactionItem> mapper = new DefaultLineMapper<>();
        mapper.setLineTokenizer(delimitedLineTokenizer);
        mapper.setFieldSetMapper(new FieldSetMapper() {
            @Override
            public TransactionItem mapFieldSet(FieldSet fieldSet) throws BindException {
                TransactionItem ti = new TransactionItem();
                ti.setTransId(fieldSet.readInt("trans_id"));
                ti.setCustId(fieldSet.readInt("cust_id"));
                ti.setAccount(fieldSet.readString("account"));
                ti.setCardNbr(fieldSet.readString("card_nbr"));
                ti.setTranno(fieldSet.readInt("tranno"));
                ti.setMonthNbr(fieldSet.readInt("month_nbr"));
                ti.setBill(fieldSet.readBigDecimal("bill"));
                ti.setTransType(fieldSet.readString("trans_type"));
                ti.setTxnDatetime(fieldSet.readDate("txn_datetime"));
                //设置在TransItem对象中进行返回
                return ti;
            }
        });
        //检查
        mapper.afterPropertiesSet();
        //映射一行
        flatFileItemReader.setLineMapper(mapper);
        return flatFileItemReader;
    }
}
