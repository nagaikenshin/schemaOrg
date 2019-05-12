package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ALTERNATIVE_HEADLINE;
import org.kyojo.schemaorg.m3n5.core.Container.AlternativeHeadline;

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
