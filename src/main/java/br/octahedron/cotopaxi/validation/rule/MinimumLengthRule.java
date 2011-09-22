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
package br.octahedron.cotopaxi.validation.rule;

import br.octahedron.cotopaxi.validation.Rule;


/**
 * A rule to verify the minimum input length.
 * 
 * It's exclusive, it means that input length should be equals or greater than configured length.
 * 
 * @author Danilo Queiroz - daniloqueiroz@octahedron.com.br
 * 
 */
public class MinimumLengthRule extends Rule {

	private int minLength;

	public MinimumLengthRule(String message, int minLength) {
		super(message);
		this.minLength = minLength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.octahedron.cotopaxi.validation.ValidationRule#isValid(java.lang.String)
	 */
	@Override
	public boolean isValid(String input) {
		return this.minLength <= input.length();
	}
}
