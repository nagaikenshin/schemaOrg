package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NAME_FUZZY;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;

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
