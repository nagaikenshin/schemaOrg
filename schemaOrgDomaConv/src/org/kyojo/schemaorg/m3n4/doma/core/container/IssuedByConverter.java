package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ISSUED_BY;
import org.kyojo.schemaorg.m3n4.core.Container.IssuedBy;

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
