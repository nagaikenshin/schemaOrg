package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUGAR_CONTENT;
import org.kyojo.schemaOrg.m3n3.core.Container.SugarContent;

@ExternalDomain
public class SugarContentConverter implements DomainConverter<SugarContent, String> {

	@Override
	public String fromDomainToValue(SugarContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SugarContent fromValueToDomain(String value) {
		return new SUGAR_CONTENT(value);
	}

}
