package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DISTINGUISHING_SIGN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DistinguishingSign;

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
