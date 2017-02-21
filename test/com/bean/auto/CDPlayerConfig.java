package com.bean.auto;

import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/02/21
 * Time  21：07
 */

/**
 * @ComponentScan()
 * @ComponentScan("xxx")
 * @ComponentScan(basePackage={"xx"|"xx"})
 * 表示开启了bean的扫描 将会扫描当前包下的所有包以及子包 带有 @Component 注解的类
 *  当然这个配置也可以在xml配置
 *  <context:component-scan base-package="包名" />
 */
@ComponentScan()
public class CDPlayerConfig {

}
