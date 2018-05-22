package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATA_DOWNLOAD;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DataDownload;

@ExternalDomain
public class DataDownloadConverter implements DomainConverter<DataDownload, String> {

	@Override
	public String fromDomainToValue(DataDownload domain) {
		return domain.getNativeValue();
	}

	@Override
	public DataDownload fromValueToDomain(String value) {
		return new DATA_DOWNLOAD(value);
	}

}
