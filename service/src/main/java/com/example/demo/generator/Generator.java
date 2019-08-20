package com.example.demo.generator;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 连接数据库自动生成mybatis的bean,dao和mapper
 * Created by donghang on 15/8/5.
 */
public class Generator  {
    public static void main(String[] args) {
        try {
            System.out.println("start generator ...");
            String filePath = Generator.class.getResource("generatorConfig.xml").getFile();
            System.out.println(">>>>"+filePath);
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File(filePath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println("end generator!");
            for(String e: warnings){
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
