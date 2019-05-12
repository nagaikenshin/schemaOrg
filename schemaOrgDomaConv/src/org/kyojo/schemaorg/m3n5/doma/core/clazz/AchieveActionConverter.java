package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACHIEVE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.AchieveAction;

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
