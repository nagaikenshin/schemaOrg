package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DOWNLOAD_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DownloadAction;

@ExternalDomain
public class DownloadActionConverter implements DomainConverter<DownloadAction, String> {

	@Override
	public String fromDomainToValue(DownloadAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DownloadAction fromValueToDomain(String value) {
		return new DOWNLOAD_ACTION(value);
	}

}
