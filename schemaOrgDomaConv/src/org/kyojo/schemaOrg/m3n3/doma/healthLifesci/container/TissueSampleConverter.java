package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.TISSUE_SAMPLE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TissueSample;

@ExternalDomain
public class TissueSampleConverter implements DomainConverter<TissueSample, String> {

	@Override
	public String fromDomainToValue(TissueSample domain) {
		return domain.getNativeValue();
	}

	@Override
	public TissueSample fromValueToDomain(String value) {
		return new TISSUE_SAMPLE(value);
	}

}
