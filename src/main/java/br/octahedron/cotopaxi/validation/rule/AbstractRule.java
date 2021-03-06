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
 * Defines the base for validation rules. Validation Rules are responsible by check if a given input
 * is valid.
 * 
 * @author Danilo Queiroz - daniloqueiroz@octahedron.com.br
 */
public abstract class AbstractRule implements Rule {

	protected String message;

	/**
	 * @param message
	 *            The message for validation fail
	 */
	public AbstractRule(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 */
	public String getMessage() {
		return this.message;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
