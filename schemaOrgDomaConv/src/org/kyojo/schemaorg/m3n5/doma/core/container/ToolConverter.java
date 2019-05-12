package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TOOL;
import org.kyojo.schemaorg.m3n5.core.Container.Tool;

@ExternalDomain
public class ToolConverter implements DomainConverter<Tool, String> {

	@Override
	public String fromDomainToValue(Tool domain) {
		return domain.getNativeValue();
	}

	@Override
	public Tool fromValueToDomain(String value) {
		return new TOOL(value);
	}

}
