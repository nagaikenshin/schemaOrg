package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DISTINGUISHING_SIGN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DistinguishingSign;

@ExternalDomain
public class DistinguishingSignConverter implements DomainConverter<DistinguishingSign, String> {

	@Override
	public String fromDomainToValue(DistinguishingSign domain) {
		return domain.getNativeValue();
	}

	@Override
	public DistinguishingSign fromValueToDomain(String value) {
		return new DISTINGUISHING_SIGN(value);
	}

}
