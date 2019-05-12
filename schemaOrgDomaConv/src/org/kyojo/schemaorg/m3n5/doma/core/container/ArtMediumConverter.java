package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ART_MEDIUM;
import org.kyojo.schemaorg.m3n5.core.Container.ArtMedium;

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
