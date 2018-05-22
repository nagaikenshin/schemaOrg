package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIDEO;
import org.kyojo.schemaOrg.m3n3.core.Container.Video;

@ExternalDomain
public class VideoConverter implements DomainConverter<Video, String> {

	@Override
	public String fromDomainToValue(Video domain) {
		return domain.getNativeValue();
	}

	@Override
	public Video fromValueToDomain(String value) {
		return new VIDEO(value);
	}

}
