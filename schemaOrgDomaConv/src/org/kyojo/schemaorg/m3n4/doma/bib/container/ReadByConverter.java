package org.kyojo.schemaorg.m3n4.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.bib.impl.READ_BY;
import org.kyojo.schemaorg.m3n4.bib.Container.ReadBy;

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
