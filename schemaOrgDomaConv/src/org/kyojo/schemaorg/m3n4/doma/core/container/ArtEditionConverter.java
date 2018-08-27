package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ART_EDITION;
import org.kyojo.schemaorg.m3n4.core.Container.ArtEdition;

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
