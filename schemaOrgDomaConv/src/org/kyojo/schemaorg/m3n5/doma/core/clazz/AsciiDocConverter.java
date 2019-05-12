package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ASCII_DOC;
import org.kyojo.schemaorg.m3n5.core.Clazz.AsciiDoc;

@ExternalDomain
public class AsciiDocConverter implements DomainConverter<AsciiDoc, String> {

	@Override
	public String fromDomainToValue(AsciiDoc domain) {
		return domain.getNativeValue();
	}

	@Override
	public AsciiDoc fromValueToDomain(String value) {
		return new ASCII_DOC(value);
	}

}
