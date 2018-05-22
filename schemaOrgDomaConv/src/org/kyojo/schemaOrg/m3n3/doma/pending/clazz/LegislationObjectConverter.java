package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_OBJECT;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.LegislationObject;

@ExternalDomain
public class LegislationObjectConverter implements DomainConverter<LegislationObject, String> {

	@Override
	public String fromDomainToValue(LegislationObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationObject fromValueToDomain(String value) {
		return new LEGISLATION_OBJECT(value);
	}

}
