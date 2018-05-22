package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOSE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LoseAction;

@ExternalDomain
public class LoseActionConverter implements DomainConverter<LoseAction, String> {

	@Override
	public String fromDomainToValue(LoseAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoseAction fromValueToDomain(String value) {
		return new LOSE_ACTION(value);
	}

}
