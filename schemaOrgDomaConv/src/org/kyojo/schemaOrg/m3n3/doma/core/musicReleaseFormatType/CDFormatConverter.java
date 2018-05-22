package org.kyojo.schemaOrg.m3n3.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicReleaseFormatType.CD_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.MusicReleaseFormatType.CDFormat;

@ExternalDomain
public class CDFormatConverter implements DomainConverter<CDFormat, String> {

	@Override
	public String fromDomainToValue(CDFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public CDFormat fromValueToDomain(String value) {
		return new CD_FORMAT(value);
	}

}
