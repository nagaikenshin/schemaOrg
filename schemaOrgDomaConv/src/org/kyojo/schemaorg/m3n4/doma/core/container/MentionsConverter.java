package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MENTIONS;
import org.kyojo.schemaorg.m3n4.core.Container.Mentions;

@ExternalDomain
public class MentionsConverter implements DomainConverter<Mentions, String> {

	@Override
	public String fromDomainToValue(Mentions domain) {
		return domain.getNativeValue();
	}

	@Override
	public Mentions fromValueToDomain(String value) {
		return new MENTIONS(value);
	}

}
