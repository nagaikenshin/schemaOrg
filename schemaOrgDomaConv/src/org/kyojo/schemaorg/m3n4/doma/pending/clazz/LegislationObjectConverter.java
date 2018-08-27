package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_OBJECT;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LegislationObject;

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
