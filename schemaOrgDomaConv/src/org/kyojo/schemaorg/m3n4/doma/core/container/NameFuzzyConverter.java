package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NAME_FUZZY;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;

@ExternalDomain
public class NameFuzzyConverter implements DomainConverter<NameFuzzy, String> {

	@Override
	public String fromDomainToValue(NameFuzzy domain) {
		return domain.getNativeValue();
	}

	@Override
	public NameFuzzy fromValueToDomain(String value) {
		return new NAME_FUZZY(value);
	}

}
