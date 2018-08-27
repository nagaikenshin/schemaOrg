package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DOWNLOAD_URL;
import org.kyojo.schemaorg.m3n4.core.Container.DownloadUrl;

@ExternalDomain
public class DownloadUrlConverter implements DomainConverter<DownloadUrl, String> {

	@Override
	public String fromDomainToValue(DownloadUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public DownloadUrl fromValueToDomain(String value) {
		return new DOWNLOAD_URL(value);
	}

}
