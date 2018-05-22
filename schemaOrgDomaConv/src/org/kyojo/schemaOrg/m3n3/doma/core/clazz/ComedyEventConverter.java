package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMEDY_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ComedyEvent;

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
