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

package me.ksviety.cacti.math.inerpolation

import me.ksviety.cacti.math.Number
import kotlin.test.Test
import kotlin.test.assertEquals

class LinearSampleTest {

	@Test
	fun `test linear sample`() {
		val min = 0
		val max = 10
		val factor = 0.5

		assertEquals(
			5.0,
			LinearSample(
				Number(min),
				Number(max),
				Number(factor),
			).collapse()
		)
	}

	@Test
	fun `test clamped linear sample`() {
		val min = 0
		val max = 10.0
		val factor = 5.0

		assertEquals(
			max,
			LinearSample.Clamped(
				Number(min),
				Number(max),
				Number(factor),
			).collapse()
		)
	}
}
