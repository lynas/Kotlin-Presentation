package section_5

import java.io.Closeable
import java.io.File


fun higherOrder(func: (Int, Int) -> Int) {
    println(func(2, 3))
}


fun mySum(x: Int, y: Int): Int {
    return x + y
}


fun main(args: Array<String>) {
    higherOrder(::mySum)

    higherOrder({ x, y ->
        x + y
    })
}


fun using(obj: Closeable, action: () -> Unit) {
    try {
        action()
    } finally {
        obj.close()
    }
}

fun withFn(file:String) {
    with(File(file)) {
        if (isFile) {

        }
    }
}


enum class Type {
    TYPE1,TYPE2,TYPE3
}

fun withFunction(type:Type) {
    when (type) {
        Type.TYPE1 -> println("T1")
        Type.TYPE2 -> println("T2")
        Type.TYPE3 -> println("T3")
    }



}
















