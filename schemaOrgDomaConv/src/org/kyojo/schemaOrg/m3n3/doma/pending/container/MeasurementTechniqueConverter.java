package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.MEASUREMENT_TECHNIQUE;
import org.kyojo.schemaOrg.m3n3.pending.Container.MeasurementTechnique;

@ExternalDomain
public class MeasurementTechniqueConverter implements DomainConverter<MeasurementTechnique, String> {

	@Override
	public String fromDomainToValue(MeasurementTechnique domain) {
		return domain.getNativeValue();
	}

	@Override
	public MeasurementTechnique fromValueToDomain(String value) {
		return new MEASUREMENT_TECHNIQUE(value);
	}

}
