package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MECHANISM_OF_ACTION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MechanismOfAction;

@ExternalDomain
public class MechanismOfActionConverter implements DomainConverter<MechanismOfAction, String> {

	@Override
	public String fromDomainToValue(MechanismOfAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public MechanismOfAction fromValueToDomain(String value) {
		return new MECHANISM_OF_ACTION(value);
	}

}
