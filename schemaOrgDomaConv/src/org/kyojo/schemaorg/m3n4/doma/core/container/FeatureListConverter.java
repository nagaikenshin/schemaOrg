package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FEATURE_LIST;
import org.kyojo.schemaorg.m3n4.core.Container.FeatureList;

@ExternalDomain
public class FeatureListConverter implements DomainConverter<FeatureList, String> {

	@Override
	public String fromDomainToValue(FeatureList domain) {
		return domain.getNativeValue();
	}

	@Override
	public FeatureList fromValueToDomain(String value) {
		return new FEATURE_LIST(value);
	}

}
