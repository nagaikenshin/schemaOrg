package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PUBLICATION_TYPE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PublicationType;

@ExternalDomain
public class PublicationTypeConverter implements DomainConverter<PublicationType, String> {

	@Override
	public String fromDomainToValue(PublicationType domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicationType fromValueToDomain(String value) {
		return new PUBLICATION_TYPE(value);
	}

}
