package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ALTERNATIVE_HEADLINE;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternativeHeadline;

@ExternalDomain
public class AlternativeHeadlineConverter implements DomainConverter<AlternativeHeadline, String> {

	@Override
	public String fromDomainToValue(AlternativeHeadline domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlternativeHeadline fromValueToDomain(String value) {
		return new ALTERNATIVE_HEADLINE(value);
	}

}
