package com.jrx.batch.customer;

import com.jrx.batch.pojo.Customer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.net.BindException;

/**
 * 读取customer.txt文件
 *
 * @author Administrator
 * @create 2019-04-15 18:06
 * @className FileReaderCustomer
 **/
@Configuration
public class FileReaderCustomer {

    @Bean
    public FlatFileItemReader<Customer> readerCustomer(){
        FlatFileItemReader<Customer> flatFileItemReader = new FlatFileItemReader<Customer>();
        //读取的文件
        flatFileItemReader.setResource(new ClassPathResource("Customer.txt"));
        //跳过第一行
        flatFileItemReader.setLinesToSkip(1);

        //解析数据
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        //每行的意思
        delimitedLineTokenizer.setNames(new String[]{"cust_id","surname","gender","educa_des","mar_des","birthday","address"});
        delimitedLineTokenizer.setDelimiter(",");
        //映射对象
        DefaultLineMapper<Customer> mapper = new DefaultLineMapper<>();
        mapper.setLineTokenizer(delimitedLineTokenizer);
        mapper.setFieldSetMapper(new FieldSetMapper() {
            @Override
            public Customer mapFieldSet(FieldSet fieldSet) {
                Customer stu = new Customer();
                stu.setCustId(fieldSet.readInt("cust_id"));
                stu.setSurname(fieldSet.readString("surname"));
                stu.setGender(fieldSet.readString("gender"));
                stu.setEducaDes(fieldSet.readString("educa_des"));
                stu.setMarDes(fieldSet.readString("mar_des"));
                stu.setBirthday(fieldSet.readInt("birthday"));
                stu.setAddress(fieldSet.readString("address"));
                //设置在Customer对象中进行返回
                return stu;
            }
        });
        //检查
        mapper.afterPropertiesSet();
        //映射一行
        flatFileItemReader.setLineMapper(mapper);
        return flatFileItemReader;
    }
}
