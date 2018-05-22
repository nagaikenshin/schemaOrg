package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.PUBLISHER_IMPRINT;
import org.kyojo.schemaOrg.m3n3.bib.Container.PublisherImprint;

@ExternalDomain
public class PublisherImprintConverter implements DomainConverter<PublisherImprint, String> {

	@Override
	public String fromDomainToValue(PublisherImprint domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublisherImprint fromValueToDomain(String value) {
		return new PUBLISHER_IMPRINT(value);
	}

}
