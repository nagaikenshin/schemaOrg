package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COMEDY_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComedyEvent;

@ExternalDomain
public class ComedyEventConverter implements DomainConverter<ComedyEvent, String> {

	@Override
	public String fromDomainToValue(ComedyEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComedyEvent fromValueToDomain(String value) {
		return new COMEDY_EVENT(value);
	}

}
