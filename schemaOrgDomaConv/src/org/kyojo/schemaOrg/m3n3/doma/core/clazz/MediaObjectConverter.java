package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MEDIA_OBJECT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MediaObject;

@ExternalDomain
public class MediaObjectConverter implements DomainConverter<MediaObject, String> {

	@Override
	public String fromDomainToValue(MediaObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public MediaObject fromValueToDomain(String value) {
		return new MEDIA_OBJECT(value);
	}

}
