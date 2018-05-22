package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.READ_BY;
import org.kyojo.schemaOrg.m3n3.bib.Container.ReadBy;

@ExternalDomain
public class ReadByConverter implements DomainConverter<ReadBy, String> {

	@Override
	public String fromDomainToValue(ReadBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReadBy fromValueToDomain(String value) {
		return new READ_BY(value);
	}

}
