package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VIDEO;
import org.kyojo.schemaorg.m3n4.core.Container.Video;

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
