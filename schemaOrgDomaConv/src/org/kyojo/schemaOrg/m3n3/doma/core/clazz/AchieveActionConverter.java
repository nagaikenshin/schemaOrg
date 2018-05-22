package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACHIEVE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AchieveAction;

@ExternalDomain
public class AchieveActionConverter implements DomainConverter<AchieveAction, String> {

	@Override
	public String fromDomainToValue(AchieveAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AchieveAction fromValueToDomain(String value) {
		return new ACHIEVE_ACTION(value);
	}

}
