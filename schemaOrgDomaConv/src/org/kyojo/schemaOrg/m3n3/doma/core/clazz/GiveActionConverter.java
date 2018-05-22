package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GIVE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GiveAction;

@ExternalDomain
public class GiveActionConverter implements DomainConverter<GiveAction, String> {

	@Override
	public String fromDomainToValue(GiveAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public GiveAction fromValueToDomain(String value) {
		return new GIVE_ACTION(value);
	}

}
