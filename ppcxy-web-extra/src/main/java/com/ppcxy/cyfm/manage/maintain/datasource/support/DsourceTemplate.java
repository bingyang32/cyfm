package com.ppcxy.cyfm.manage.maintain.datasource.support;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by weep on 2016-5-23.
 */
@Component(value = "dsourceTemplate")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DsourceTemplate extends JdbcTemplate {
    
    
    public boolean changeDatasource(DruidDataSource dataSource) {
        try {
            this.setDataSource(dataSource);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    @Override
    public void afterPropertiesSet() {
        if (!isLazyInit()) {
            getExceptionTranslator();
        }
    }
    
}
