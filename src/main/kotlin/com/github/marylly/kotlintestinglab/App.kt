package com.github.marylly.kotlintestinglab

import io.javalin.Javalin

val port = 7000

fun main(args: Array<String>) {
    val app = Javalin.create().start(port)
    app.get("/") { ctx -> ctx.result("Hello World") }
}
