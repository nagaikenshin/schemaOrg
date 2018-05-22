package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIET_FEATURES;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DietFeatures;

@ExternalDomain
public class DietFeaturesConverter implements DomainConverter<DietFeatures, String> {

	@Override
	public String fromDomainToValue(DietFeatures domain) {
		return domain.getNativeValue();
	}

	@Override
	public DietFeatures fromValueToDomain(String value) {
		return new DIET_FEATURES(value);
	}

}
