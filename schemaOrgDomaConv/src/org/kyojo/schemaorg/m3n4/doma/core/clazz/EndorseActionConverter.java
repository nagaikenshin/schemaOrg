package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ENDORSE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.EndorseAction;

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