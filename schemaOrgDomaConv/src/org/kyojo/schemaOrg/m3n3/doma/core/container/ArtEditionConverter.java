package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ART_EDITION;
import org.kyojo.schemaOrg.m3n3.core.Container.ArtEdition;

@ExternalDomain
public class ArtEditionConverter implements DomainConverter<ArtEdition, String> {

	@Override
	public String fromDomainToValue(ArtEdition domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArtEdition fromValueToDomain(String value) {
		return new ART_EDITION(value);
	}

}
