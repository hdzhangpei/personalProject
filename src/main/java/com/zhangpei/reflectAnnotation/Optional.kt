package com.zhangpei.reflectAnnotationTest

class Optional(val bb : String = "mn", val aa : Int = 2){
    var name = "asdf";
    private fun test1111() : String {
        println("11111$aa")
        println(111)
        return "bilibili";
    }




    fun max(a: Int, b: Int) : Int {
        return if (a > b) a else b;
    }

    @Anno(666)
    fun show(name : String) {
        println("==========$name");
    }
}


