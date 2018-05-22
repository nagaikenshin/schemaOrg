package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HAS_PART;
import org.kyojo.schemaOrg.m3n3.core.Container.HasPart;

@ExternalDomain
public class HasPartConverter implements DomainConverter<HasPart, String> {

	@Override
	public String fromDomainToValue(HasPart domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasPart fromValueToDomain(String value) {
		return new HAS_PART(value);
	}

}
