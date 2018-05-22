package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FILE_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.Container.FileFormat;

@ExternalDomain
public class FileFormatConverter implements DomainConverter<FileFormat, String> {

	@Override
	public String fromDomainToValue(FileFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public FileFormat fromValueToDomain(String value) {
		return new FILE_FORMAT(value);
	}

}
