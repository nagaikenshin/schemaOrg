package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HAS_POS;
import org.kyojo.schemaOrg.m3n3.core.Container.HasPOS;

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
