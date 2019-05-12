package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ALBUM_PRODUCTION_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.AlbumProductionType;

@ExternalDomain
public class AlbumProductionTypeConverter implements DomainConverter<AlbumProductionType, String> {

	@Override
	public String fromDomainToValue(AlbumProductionType domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlbumProductionType fromValueToDomain(String value) {
		return new ALBUM_PRODUCTION_TYPE(value);
	}

}
