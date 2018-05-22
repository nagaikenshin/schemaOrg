package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OFFERED_BY;
import org.kyojo.schemaOrg.m3n3.core.Container.OfferedBy;

@ExternalDomain
public class OfferedByConverter implements DomainConverter<OfferedBy, String> {

	@Override
	public String fromDomainToValue(OfferedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfferedBy fromValueToDomain(String value) {
		return new OFFERED_BY(value);
	}

}
