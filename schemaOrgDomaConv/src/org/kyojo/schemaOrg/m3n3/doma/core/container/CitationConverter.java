package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CITATION;
import org.kyojo.schemaOrg.m3n3.core.Container.Citation;

@ExternalDomain
public class CitationConverter implements DomainConverter<Citation, String> {

	@Override
	public String fromDomainToValue(Citation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Citation fromValueToDomain(String value) {
		return new CITATION(value);
	}

}
