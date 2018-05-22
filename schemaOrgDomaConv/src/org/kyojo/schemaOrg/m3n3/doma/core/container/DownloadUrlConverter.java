package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DOWNLOAD_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.DownloadUrl;

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
