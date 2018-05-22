package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.EMISSIONS_CO2;
import org.kyojo.schemaOrg.m3n3.auto.Container.EmissionsCO2;

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
