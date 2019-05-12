package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.SD_PUBLISHER;
import org.kyojo.schemaorg.m3n5.pending.Container.SdPublisher;

@ExternalDomain
public class SdPublisherConverter implements DomainConverter<SdPublisher, String> {

	@Override
	public String fromDomainToValue(SdPublisher domain) {
		return domain.getNativeValue();
	}

	@Override
	public SdPublisher fromValueToDomain(String value) {
		return new SD_PUBLISHER(value);
	}

}
