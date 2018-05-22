package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POTENTIAL_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;

@ExternalDomain
public class PotentialActionConverter implements DomainConverter<PotentialAction, String> {

	@Override
	public String fromDomainToValue(PotentialAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PotentialAction fromValueToDomain(String value) {
		return new POTENTIAL_ACTION(value);
	}

}
