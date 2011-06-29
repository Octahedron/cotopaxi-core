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
package br.octahedron.cotopaxi.view.response;

import java.io.Writer;
import java.util.Locale;
import java.util.Map;

import br.octahedron.cotopaxi.view.render.VelocityTemplateRender;

/**
 * A {@link WriteableResponse} that render and write a velocity template.
 *  
 * @author Danilo Queiroz - daniloqueiroz@octahedron.com.br
 */
public class TemplateResponse extends WriteableResponse {
	
	private static final VelocityTemplateRender templateRender = new VelocityTemplateRender();

	private String template;

	public TemplateResponse(String template, int code, Map<String, Object> output, Map<String, String> cookies, Map<String, String> headers, Locale locale) {
		super(code, output, cookies, headers, locale);
		this.template = template;
	}

	/* (non-Javadoc)
	 * @see br.octahedron.cotopaxi.controller.response.WriteableResponse#getContentType()
	 */
	@Override
	public String getContentType() {
		return "text/html";
	}

	/* (non-Javadoc)
	 * @see br.octahedron.cotopaxi.controller.response.WriteableResponse#writeResponse(java.io.Writer, java.util.Map)
	 */
	@Override
	public void writeResponse(Writer writer) {
		templateRender.render(this.template, this.output, writer);
	}
}
