package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DESCRIPTION;
import org.kyojo.schemaorg.m3n4.core.Container.Description;

@ExternalDomain
public class DescriptionConverter implements DomainConverter<Description, String> {

	@Override
	public String fromDomainToValue(Description domain) {
		return domain.getNativeValue();
	}

	@Override
	public Description fromValueToDomain(String value) {
		return new DESCRIPTION(value);
	}

}
