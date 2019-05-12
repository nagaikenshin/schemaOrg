package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ART_GALLERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.ArtGallery;

@ExternalDomain
public class ArtGalleryConverter implements DomainConverter<ArtGallery, String> {

	@Override
	public String fromDomainToValue(ArtGallery domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArtGallery fromValueToDomain(String value) {
		return new ART_GALLERY(value);
	}

}
