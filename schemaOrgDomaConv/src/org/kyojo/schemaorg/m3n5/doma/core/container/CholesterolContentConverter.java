package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHOLESTEROL_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.CholesterolContent;

@ExternalDomain
public class CholesterolContentConverter implements DomainConverter<CholesterolContent, String> {

	@Override
	public String fromDomainToValue(CholesterolContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public CholesterolContent fromValueToDomain(String value) {
		return new CHOLESTEROL_CONTENT(value);
	}

}
