/*
 *  This file is part of Cotopaxi.
 *
 *  Cotopaxi is free software: you can redistribute it and/or modify
 *  it under the terms of the Lesser GNU General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  Cotopaxi is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  Lesser GNU General Public License for more details.
 *
 *  You should have received a copy of the Lesser GNU General Public License
 *  along with Cotopaxi. If not, see <http://www.gnu.org/licenses/>.
 */
package br.octahedron.cotopaxi.controller.converter;

import static junit.framework.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.octahedron.cotopaxi.controller.Converter;
import br.octahedron.cotopaxi.controller.ConvertionException;

/**
 * @author Danilo Queiroz - daniloqueiroz@octahedron.com.br
 */
public class ConvertersTest {

	@SuppressWarnings("unchecked")
	@Test
	public void testNumberConverter() throws ConvertionException {
		Converter<Integer> integer = new IntegerConverter();
		Integer i = integer.convert("0001");
		assertEquals(new Integer(1), i);
		
		Converter<BigDecimal> bigDecimal = new BigDecimalConverter();
		BigDecimal dec = bigDecimal.convert("0.0001");
		assertEquals(new BigDecimal("0.0001"), dec);
	}
	
	@SuppressWarnings("unchecked")
	@Test(expected=ConvertionException.class)
	public void testNumberConverterFail() throws ConvertionException {
		Converter<Integer> integer = new IntegerConverter();
		integer.convert("a");
	}

}