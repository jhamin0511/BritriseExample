package com.github.jhamin0511.britriseexample

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CalculateTest {

    val calculate = Calculate()

    @Test
    fun result_Plus_AssertResult() {
        calculate.setType(Type.PLUS)
        val plus = calculate.result(4, 4)
        assertThat(plus).isEqualTo(4 + 4)
    }

    @Test
    fun result_Minus_AssertResult() {
        calculate.setType(Type.MINUS)
        val plus = calculate.result(4, 4)
        assertThat(plus).isEqualTo(4 - 4)
    }

    @Test
    fun result_Times_AssertResult() {
        calculate.setType(Type.TIMES)
        val plus = calculate.result(4, 4)
        assertThat(plus).isEqualTo(4 * 4)
    }

    @Test
    fun result_Div_AssertResult() {
        calculate.setType(Type.DIV)
        val plus = calculate.result(4, 4)
        assertThat(plus).isEqualTo(4 / 4)
    }

}
