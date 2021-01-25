package com.github.jhamin0511.britriseexample

class Calculate {
    private var type = Type.PLUS

    fun setType(type: Type) {
        this.type = type
    }

    fun setNext() {
        type = when (type) {
            Type.PLUS -> Type.MINUS
            Type.MINUS -> Type.TIMES
            Type.TIMES -> Type.DIV
            Type.DIV -> Type.PLUS
        }
    }

    fun getType(): Type {
        return type
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
