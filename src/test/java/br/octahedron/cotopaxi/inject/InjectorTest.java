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
package br.octahedron.cotopaxi.inject;

import static junit.framework.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Danilo Penna Queiroz - daniloqueiroz@octahedron.com.br
 */
public class InjectorTest {
	

	@Test
	public void testInjection() throws InstantiationException {
		UserFacade facade = Injector.getInstance(UserFacade.class);
		assertNotNull(facade);
		UserService service = facade.getUserService();
		assertNotNull(service);
		UserDAO userDAO = service.getUserDAO();
		assertNotNull(userDAO);
	}
}