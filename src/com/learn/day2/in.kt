package com.learn.day2

fun main(Args: Array<String>) {

    //如果存在于区间(1,Y-1)，则打印OK
    var x = 1
    var y = 6
    if (x in 1..y)
        print("OK")
}