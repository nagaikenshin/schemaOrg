package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_TYPE;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationType;

@ExternalDomain
public class LegislationTypeConverter implements DomainConverter<LegislationType, String> {

	@Override
	public String fromDomainToValue(LegislationType domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationType fromValueToDomain(String value) {
		return new LEGISLATION_TYPE(value);
	}

}
