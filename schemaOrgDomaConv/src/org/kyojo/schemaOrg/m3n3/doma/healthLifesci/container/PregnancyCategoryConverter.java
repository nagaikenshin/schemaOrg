package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PREGNANCY_CATEGORY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PregnancyCategory;

@ExternalDomain
public class PregnancyCategoryConverter implements DomainConverter<PregnancyCategory, String> {

	@Override
	public String fromDomainToValue(PregnancyCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public PregnancyCategory fromValueToDomain(String value) {
		return new PREGNANCY_CATEGORY(value);
	}

}
