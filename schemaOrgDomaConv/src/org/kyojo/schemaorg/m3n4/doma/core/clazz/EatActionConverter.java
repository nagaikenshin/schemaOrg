package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EAT_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.EatAction;

@ExternalDomain
public class EatActionConverter implements DomainConverter<EatAction, String> {

	@Override
	public String fromDomainToValue(EatAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public EatAction fromValueToDomain(String value) {
		return new EAT_ACTION(value);
	}

}
