package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMPUTER_LANGUAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ComputerLanguage;

@ExternalDomain
public class ComputerLanguageConverter implements DomainConverter<ComputerLanguage, String> {

	@Override
	public String fromDomainToValue(ComputerLanguage domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComputerLanguage fromValueToDomain(String value) {
		return new COMPUTER_LANGUAGE(value);
	}

}
