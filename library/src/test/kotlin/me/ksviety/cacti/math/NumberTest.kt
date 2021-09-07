/*
 * Copyright 2021 ksviety
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package me.ksviety.cacti.math

import me.ksviety.cacti.text.Text
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class NumberTest {

	@Test
	fun `test number`() {
		val float = Random.nextFloat()
		val double = Random.nextDouble()
		val int = Random.nextInt()

		assertEquals(float, Number(float).convertToDouble().toFloat())
		assertEquals(double, Number(double).convertToDouble())
		assertEquals(int, Number(int).convertToDouble().toInt())
	}

	@Test
	fun `test number parses text`() {
		val originalNumber = Random.nextDouble()

		assertEquals(originalNumber, Number(Text(Number(originalNumber))).convertToDouble())
	}

	@Test
	fun `test fails with invalid string`() {
		val nonumberText = Text("Not A Number")

		assertFailsWith(NumberFormatException::class) {
			Number(nonumberText)
		}
	}
}
