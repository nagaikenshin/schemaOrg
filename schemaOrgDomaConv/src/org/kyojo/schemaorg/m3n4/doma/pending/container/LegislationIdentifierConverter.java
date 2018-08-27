package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_IDENTIFIER;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationIdentifier;

@ExternalDomain
public class LegislationIdentifierConverter implements DomainConverter<LegislationIdentifier, String> {

	@Override
	public String fromDomainToValue(LegislationIdentifier domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationIdentifier fromValueToDomain(String value) {
		return new LEGISLATION_IDENTIFIER(value);
	}

}