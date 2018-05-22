package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISSUED_BY;
import org.kyojo.schemaOrg.m3n3.core.Container.IssuedBy;

@ExternalDomain
public class IssuedByConverter implements DomainConverter<IssuedBy, String> {

	@Override
	public String fromDomainToValue(IssuedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public IssuedBy fromValueToDomain(String value) {
		return new ISSUED_BY(value);
	}

}
