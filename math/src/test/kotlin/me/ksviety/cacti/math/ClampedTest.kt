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

import kotlin.test.Test
import kotlin.test.assertEquals

class ClampedTest {

	@Test
	fun `test clamping at most`() {
		val max = 10.0
		val min = 5.0

		assertEquals(max, Clamped(Number(15), Number(min), Number(max)).collapse())
	}

	@Test
	fun `test clamping at least`() {
		val max = 10.0
		val min = 5.0

		assertEquals(min, Clamped(Number(3), Number(min), Number(max)).collapse())
	}

	@Test
	fun `test clamping in between`() {
		val max = 10.0
		val min = 5.0
		val value = 7.0

		assertEquals(value, Clamped(Number(value), Number(min), Number(max)).collapse())
	}
}
