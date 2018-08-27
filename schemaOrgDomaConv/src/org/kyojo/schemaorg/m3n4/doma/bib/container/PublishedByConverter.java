package org.kyojo.schemaorg.m3n4.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.bib.impl.PUBLISHED_BY;
import org.kyojo.schemaorg.m3n4.bib.Container.PublishedBy;

@ExternalDomain
public class PublishedByConverter implements DomainConverter<PublishedBy, String> {

	@Override
	public String fromDomainToValue(PublishedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublishedBy fromValueToDomain(String value) {
		return new PUBLISHED_BY(value);
	}

}
