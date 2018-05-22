package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation;

@ExternalDomain
public class LegislationConverter implements DomainConverter<Legislation, String> {

	@Override
	public String fromDomainToValue(Legislation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Legislation fromValueToDomain(String value) {
		return new LEGISLATION(value);
	}

}
