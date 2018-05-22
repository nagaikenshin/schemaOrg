package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ART_MEDIUM;
import org.kyojo.schemaOrg.m3n3.core.Container.ArtMedium;

@ExternalDomain
public class ArtMediumConverter implements DomainConverter<ArtMedium, String> {

	@Override
	public String fromDomainToValue(ArtMedium domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArtMedium fromValueToDomain(String value) {
		return new ART_MEDIUM(value);
	}

}
