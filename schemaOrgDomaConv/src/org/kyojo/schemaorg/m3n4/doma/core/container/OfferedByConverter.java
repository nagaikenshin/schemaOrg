package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OFFERED_BY;
import org.kyojo.schemaorg.m3n4.core.Container.OfferedBy;

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
