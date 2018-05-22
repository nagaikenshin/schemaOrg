package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENDORSE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EndorseAction;

@ExternalDomain
public class EndorseActionConverter implements DomainConverter<EndorseAction, String> {

	@Override
	public String fromDomainToValue(EndorseAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public EndorseAction fromValueToDomain(String value) {
		return new ENDORSE_ACTION(value);
	}

}
