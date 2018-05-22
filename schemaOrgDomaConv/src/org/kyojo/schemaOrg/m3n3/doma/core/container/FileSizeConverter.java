package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FILE_SIZE;
import org.kyojo.schemaOrg.m3n3.core.Container.FileSize;

@ExternalDomain
public class FileSizeConverter implements DomainConverter<FileSize, String> {

	@Override
	public String fromDomainToValue(FileSize domain) {
		return domain.getNativeValue();
	}

	@Override
	public FileSize fromValueToDomain(String value) {
		return new FILE_SIZE(value);
	}

}
