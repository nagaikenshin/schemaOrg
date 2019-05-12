package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HAS_PART;
import org.kyojo.schemaorg.m3n5.core.Container.HasPart;

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
