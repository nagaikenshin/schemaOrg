package org.kyojo.schemaorg.m3n4.doma.auto.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.EMISSIONS_CO2;
import org.kyojo.schemaorg.m3n4.auto.Container.EmissionsCO2;

@ExternalDomain
public class EmissionsCO2Converter implements DomainConverter<EmissionsCO2, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(EmissionsCO2 domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmissionsCO2 fromValueToDomain(BigDecimal value) {
		return new EMISSIONS_CO2(value);
	}

}
