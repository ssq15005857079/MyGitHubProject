package com.ssq.www.config.mybatis;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * 自定义的给mybatis配置查询规则配置一个ConfigurationCustomizer就可以了
 * @author Administrator
 *
 */
@Configurable
public class MybatisCnfig {
	
	@Bean
	public ConfigurationCustomizer configurationCustomizer(){
		ConfigurationCustomizer configurationCustomizer = new ConfigurationCustomizer() {
			
			@Override
			public void customize(Configuration configuration) {
				configuration.setUseActualParamName(true);//开启驼峰命名
				
			}
		};
		return configurationCustomizer;
	}

}
