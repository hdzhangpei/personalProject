package com.zhangpei.reflectAnnotationTest

import java.util.Arrays

@Throws(IllegalAccessException::class, InstantiationException::class, ClassNotFoundException::class)
fun main(args: Array<String>) {

    val clazz = Class.forName("com.zhangpei.reflectAnnotationTest.Optional")
//    val obj = clazz.newInstance()
    val methods1 = clazz.declaredMethods
    val list = Arrays.asList(*methods1)

    val me = list.filter { method -> method.name == "show" }[0]
    val anno = me.getAnnotation(Anno:: class.java)

    println(anno.typec)
}
