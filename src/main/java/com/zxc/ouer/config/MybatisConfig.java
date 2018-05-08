package com.zxc.ouer.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-05-08
 * Time: 下午11:55
 */
@Configuration
@MapperScan(basePackages = {"com.zxc.ouer.mapper"})
public class MybatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(dataSource);
//        sfb.setTypeAliasesPackage("com.zxc.ouer.entity");
        sfb.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml"));
        return sfb.getObject();
    }
}
