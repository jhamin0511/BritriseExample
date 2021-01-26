package com.github.jhamin0511.britriseexample

class Calculate {
    private var type = Type.PLUS

    fun setType(type: Type) {
        this.type = type
    }

    fun result(one: Int, two: Int): Int {
        return when (type) {
            Type.PLUS -> one.plus(two)
            Type.MINUS -> one.minus(two)
            Type.TIMES -> one.times(two)
            Type.DIV -> one.div(two)
        }
    }
}
