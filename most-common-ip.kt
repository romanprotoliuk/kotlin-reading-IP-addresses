package io

import java.io.File

fun main() {

    val ipToCount = mutableMapOf<String, Int>()
    File("src/60.ips.txt").forEachLine {
        val previus = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previus + 1)
    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!

    println("Most frequent IP address is $maxIp, which occurred $maxCount times.")
}