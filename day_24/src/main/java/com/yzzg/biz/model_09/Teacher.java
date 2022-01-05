package com.yzzg.biz.model_09;

/**
 * 懒汉式
 */
public class Teacher {
    private Teacher(){}

    private static Teacher t = null;

    public synchronized static Teacher getTeacherInstance(){
        if (t == null) {
            t = new Teacher();
        }
        return t;
    }
}
