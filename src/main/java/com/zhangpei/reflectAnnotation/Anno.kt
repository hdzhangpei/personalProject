package com.zhangpei.reflectAnnotationTest


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Anno(val typec: Int = 2)