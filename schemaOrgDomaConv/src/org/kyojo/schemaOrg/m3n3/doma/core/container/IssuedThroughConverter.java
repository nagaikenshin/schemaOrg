package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISSUED_THROUGH;
import org.kyojo.schemaOrg.m3n3.core.Container.IssuedThrough;

@ExternalDomain
public class IssuedThroughConverter implements DomainConverter<IssuedThrough, String> {

	@Override
	public String fromDomainToValue(IssuedThrough domain) {
		return domain.getNativeValue();
	}

	@Override
	public IssuedThrough fromValueToDomain(String value) {
		return new ISSUED_THROUGH(value);
	}

}
