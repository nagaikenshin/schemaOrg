package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.MEASUREMENT_TECHNIQUE;
import org.kyojo.schemaorg.m3n5.pending.Container.MeasurementTechnique;

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
