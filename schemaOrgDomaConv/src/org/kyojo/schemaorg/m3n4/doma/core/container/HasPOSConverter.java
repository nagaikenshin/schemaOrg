package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HAS_POS;
import org.kyojo.schemaorg.m3n4.core.Container.HasPOS;

@ExternalDomain
public class HasPOSConverter implements DomainConverter<HasPOS, String> {

	@Override
	public String fromDomainToValue(HasPOS domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasPOS fromValueToDomain(String value) {
		return new HAS_POS(value);
	}

}
