package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HEADLINE;
import org.kyojo.schemaOrg.m3n3.core.Container.Headline;

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
