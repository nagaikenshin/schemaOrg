package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VISUAL_ARTWORK;
import org.kyojo.schemaOrg.m3n3.core.Clazz.VisualArtwork;

@ExternalDomain
public class VisualArtworkConverter implements DomainConverter<VisualArtwork, String> {

	@Override
	public String fromDomainToValue(VisualArtwork domain) {
		return domain.getNativeValue();
	}

	@Override
	public VisualArtwork fromValueToDomain(String value) {
		return new VISUAL_ARTWORK(value);
	}

}
