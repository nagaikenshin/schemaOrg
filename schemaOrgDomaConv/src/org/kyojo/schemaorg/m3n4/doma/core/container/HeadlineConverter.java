package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HEADLINE;
import org.kyojo.schemaorg.m3n4.core.Container.Headline;

@ExternalDomain
public class HeadlineConverter implements DomainConverter<Headline, String> {

	@Override
	public String fromDomainToValue(Headline domain) {
		return domain.getNativeValue();
	}

	@Override
	public Headline fromValueToDomain(String value) {
		return new HEADLINE(value);
	}

}
