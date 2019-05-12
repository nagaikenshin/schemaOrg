package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PUBLICATION;
import org.kyojo.schemaorg.m3n5.core.Container.Publication;

@ExternalDomain
public class PublicationConverter implements DomainConverter<Publication, String> {

	@Override
	public String fromDomainToValue(Publication domain) {
		return domain.getNativeValue();
	}

	@Override
	public Publication fromValueToDomain(String value) {
		return new PUBLICATION(value);
	}

}
