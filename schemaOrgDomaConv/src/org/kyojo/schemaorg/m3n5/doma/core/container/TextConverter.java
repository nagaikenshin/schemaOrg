package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.core.Container.Text;

@ExternalDomain
public class TextConverter implements DomainConverter<Text, String> {

	@Override
	public String fromDomainToValue(Text domain) {
		return domain.getNativeValue();
	}

	@Override
	public Text fromValueToDomain(String value) {
		return new TEXT(value);
	}

}
