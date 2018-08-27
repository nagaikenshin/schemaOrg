package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.POTENTIAL_ACTION;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;

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
