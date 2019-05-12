package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MEDIA_SUBSCRIPTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.MediaSubscription;

@ExternalDomain
public class MediaSubscriptionConverter implements DomainConverter<MediaSubscription, String> {

	@Override
	public String fromDomainToValue(MediaSubscription domain) {
		return domain.getNativeValue();
	}

	@Override
	public MediaSubscription fromValueToDomain(String value) {
		return new MEDIA_SUBSCRIPTION(value);
	}

}
