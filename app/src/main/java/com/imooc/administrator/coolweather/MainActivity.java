package com.imooc.administrator.coolweather;
/**
 * 和风天气API key:3e591e7a8ae745cdacfa5ec8346190ad
 */

/**
 * 一、创建数据库和表
 * 1、新建省、市、县类，并继承DataSupport
 * 2、配置litepal.xml，完成映射
 * 3、在注册文件中，配置LitePalApplication
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
