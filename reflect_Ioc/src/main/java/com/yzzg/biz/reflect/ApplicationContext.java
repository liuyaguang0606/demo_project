package com.yzzg.biz.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class ApplicationContext<T> {
    private HashMap<Class,Object> beanContext = new HashMap<Class,Object>();

    /**
     * 获取bean
     * @param clazz
     * @return
     */
    public T getBean(Class clazz){
        return (T) beanContext.get(clazz);
    }

    /**
     *  第一版本
     * 人工初始化bean容器
     */
//    public void initContext(){
//        beanContext.put(UserDao.class, new UserDaoImpl());
//        beanContext.put(BookDao.class, new BookDaoImpl());
//
//    }

    /**
     *  第二版本
     * 对上面人工初始化的升级 通过反射 配合 配置文件 帮我们初始化bean对象
     */
    public void initContext() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        InputStream resource = ApplicationContext.class.getClassLoader()
                .getResourceAsStream("config/bean.config");
        Properties properties = new Properties();
        properties.load(resource);
        //遍历配置文件 通过反射创建对象 ，初始化bean 上下文容器
        final Set<Object> objects = properties.keySet();
        for (Object obj : objects) {

            beanContext.put(Class.forName(obj.toString()),
                    Class.forName(properties.get(obj.toString()).toString()).newInstance() );
        }
    }

}
